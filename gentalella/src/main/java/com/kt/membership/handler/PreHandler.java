
package com.kt.membership.handler;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.kt.membership.annotaion.NoTokenCheck;
import com.kt.membership.annotaion.NoVersionCheck;
import com.kt.membership.annotaion.ServerStatusCheck;
//import com.kt.membership.dao.AccessIpRepository;
//import com.kt.membership.dao.AppRepository;
//import com.kt.membership.dao.LoginRepository;
//import com.kt.membership.dao.NoticePopupRepository;
//import com.kt.membership.dao.SafeDBService;
import com.kt.membership.domain.entity.AccessIp;
import com.kt.membership.domain.entity.App;
import com.kt.membership.domain.entity.Login;
import com.kt.membership.domain.entity.NoticePopup;
import com.kt.membership.exception.AuthenticationException;
import com.kt.membership.exception.InterceptorExcepion;
import com.kt.membership.util.Define;

public class PreHandler extends HandlerInterceptorAdapter{
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Value("${server.type}")
	private String serverType;
	
//	@Autowired
//	AppRepository appRepository;
//	
//	@Autowired
//	NoticePopupRepository noticePopupRepository;
//	
//	@Autowired
//	LoginRepository loginRepository;
//	
//	@Autowired
//	AccessIpRepository accessIpRepository;
//		
//	@Autowired
//	SafeDBService safeDBService;
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if(request.getRequestURI().matches(".*(api-docs|jsp|error|statistic).*")) return true; // apiDocument  | jsp | error | statistic Skip
		
		if(request.getRequestURI().matches(".swagger.*")) {
			//운영일 경우 ip체크
//			if("3".equals(serverType)) {
//				String ipAddr = request.getRemoteAddr();
//				logger.info("request swagger : ip = " + ipAddr);
//				AccessIp acccessIp = accessIpRepository.findByIpAndUseYn(ipAddr, "Y");
//				if(acccessIp != null)
//					return true;
//				else 
//					return false;
//			}
//			else
				return true;
			
		}
		MDC.put("uuid",RandomStringUtils.randomAlphanumeric(10));
		MDC.put("host", System.getenv("HOSTNAME"));
		MDC.put("startTime", System.currentTimeMillis()+"");
		MDC.put("apiGubun", "API");
		MDC.put("uri", request.getRequestURI());
		
		logger.debug("URI : " + request.getRequestURI());
		
		String os = request.getHeader("os");
		String appVersion = request.getHeader("appVersion");
		
		StringBuffer buf = new StringBuffer();
		buf.append("requestHeader").append(request.getRequestURI()).append("?").append(request.getQueryString());
		buf.append(" HEADERS [");
		for(Enumeration<String> e = request.getHeaderNames(); e.hasMoreElements();) {
			String attrName = (String) e.nextElement();
			String attrValue = (String) request.getHeader(attrName);
			buf.append(", ").append(attrName).append(": ").append(attrValue);
		}
		buf.append("]");
		logger.info(buf.toString());
		
		final HandlerMethod handlerMethod = (HandlerMethod) handler;
		final Method currentMethod = handlerMethod.getMethod();
		boolean noTokenCheck = currentMethod.isAnnotationPresent(NoTokenCheck.class);
		boolean noVersionCheck = currentMethod.isAnnotationPresent(NoVersionCheck.class);
		boolean noServerStatusCheck = currentMethod.isAnnotationPresent(ServerStatusCheck.class);
		
		
		//Server Status Check
		if (!noServerStatusCheck && !serverStatusCheck(request)) {
			throw new InterceptorExcepion((int)request.getAttribute("code"), (String) request.getAttribute("message"), (Character) request.getAttribute("exitYn"));
		}
		
		//App Version Check
		if (!noVersionCheck) {
			logger.debug("version check start");
			if(!versionCheck(request, os, appVersion)) {
				logger.debug("PreHandler , version check fail");
				throw new InterceptorExcepion((int) request.getAttribute("code"),(String) request.getAttribute("message"), (Character)request.getAttribute("exitYn"));
				
			}else {
				logger.debug("version check success");
			}
		}
		
		//Auth Key Check
		if(!noTokenCheck) {
			logger.debug("token check start");
			String memberType = request.getHeader("memberType");
			String memberId = request.getHeader("memberId");
			String encMemberType	=	request.getHeader("encMemberType");
			String encMemberId		=	request.getHeader("encMemberId");
			String authKey			=	request.getHeader("authKey");
			
			if(!StringUtils.isEmpty(encMemberType) && !StringUtils.isEmpty(encMemberId)) {
//				memberType = AES128Cipher.decodingAES(encMemberType);
//				memberId	=	AES128Cipher.decodingAES(encMemberId);
				
			}
			
			if(!tokenCheck(request, memberType, memberId, authKey)) {
				logger.debug("PreHander , token check fail");
				throw new AuthenticationException((int) request.getAttribute("code"), (String) request.getAttribute("message"));								
			}else {
				logger.debug("PreHandler, token check success");				
			}
			
		}	
		
		return super.preHandle(request, response, handler);
	}
	
	private boolean tokenCheck(HttpServletRequest request, String memberType, String memberId, String authKey) 
		throws Exception{
		if(StringUtils.isEmpty(authKey)) {
			request.setAttribute("code", Define.ERROR_CODE);
			request.setAttribute("message", Define.ERROR_MESSAGE);
			
			logger.debug("authkey_empty");
			return false;
		} else if(StringUtils.isEmpty(memberId)) {
			request.setAttribute("code", Define.ERROR_CODE);
			request.setAttribute("message", Define.ERROR_MESSAGE);
			return false;
		} else {
			String mbrId	=	memberType + memberId;
//			Login login		=	loginRepository.findByMbrIdAndAuthKey(mbrId, authKey);
//			if(login != null) {
				return true;
//			}else {
//				request.setAttribute("code", Define.ERROR_CODE);
//				request.setAttribute("message", Define.ERROR_MESSAGE);
//				logger.debug("token_check_fail");
//				return false;
//			}
		}
	}
	
	
	//서버 점검 - true : 서버점검 아님, false : 서버 점검 중
	private boolean serverStatusCheck(HttpServletRequest request) {
		Timestamp now = new Timestamp(new Date().getTime());
		
//		NoticePopup noticePopup = noticePopupRepository.findTop1ByMenuAndStartDateBeforeAndEndDateAfterOrderByStartDate(0, now, now);
//		logger.debug("notice popup : " + noticePopup);
//		if(noticePopup != null) {
//			request.setAttribute("code", Define.SERVER_IS_NOT_AVAILABLE_CODE);
//			request.setAttribute("message", noticePopup.getContents());
//			request.setAttribute("exitYn", noticePopup.getExitYn());
//			return false;
//		} else {
			return true;
//		}
	}
	
	//App version Check, flase = fail, true = success
	private boolean versionCheck(HttpServletRequest request, String os, String appVersion) {
		if(StringUtils.isEmpty(os)) {
			request.setAttribute("code", Define.ERROR_CODE);
			request.setAttribute("message", Define.ERROR_MESSAGE);
			logger.debug("os is empty");
			return false;
		} else if(StringUtils.isEmpty(appVersion)) {
			request.setAttribute("code", Define.ERROR_CODE);
			request.setAttribute("message", Define.ERROR_MESSAGE);
			logger.debug("appVersion is empty");
			return false;
		} else {
//			App app = appRepository.findByOsAndVersionAndUseYn(os, appVersion, 'Y');
//			if(app == null) {
//				request.setAttribute("code", Define.ERROR_CODE);
//				request.setAttribute("message", Define.ERROR_MESSAGE);
//				logger.debug("unkwonVersion");
//				return false;
//				
//			}else {
//				App lastestPrdApp = appRepository.findTop1ByOsAndStatusAndUseYnOrderByVersionDesc(os, 'P', 'Y');
//				if(app.getVersionInt() < lastestPrdApp.getVersionInt()) {
//					request.setAttribute("code", Define.APP_UPDATE_ERROR_CODE); //강제 update
//					request.setAttribute("message", lastestPrdApp.getContents());
//					logger.debug("need update");
//					return false;
//					
//				}else {
//					logger.debug("lastest app : " + lastestPrdApp.toString());
					return true;
//				}
//			}
		}
	}
}
