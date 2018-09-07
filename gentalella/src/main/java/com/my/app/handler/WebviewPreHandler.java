package com.my.app.handler;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.RandomStringUtils;
import org.jboss.logging.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class WebviewPreHandler extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(WebviewPreHandler.class);
	
	@Autowired
	Environment env;
	
	private List<String> excludeTarget = null;
	
	public void setExcludeTarget(List<String> target) {
		excludeTarget = target;
	}
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		MDC.put("uuid", RandomStringUtils.randomAlphanumeric(10));
		MDC.put("host", System.getenv("HOSTNAME"));
		MDC.put("startTime", System.currentTimeMillis()+"");
		MDC.put("apiGubun", "WEB");
		MDC.put("uri", request.getRequestURI());
		
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
		
		WebviewPreHandler webviewPreHandler = null;
		String strClassName = handler.getClass().getName();
		boolean bExclude = false;
		
		for(String target : excludeTarget) {
			if(strClassName.matches(target)) {
				bExclude = true;
				break;
			}
		}
		
		if(bExclude) {
			return super.preHandle(request, response, webviewPreHandler);
		}
		
		if(strClassName.matches(".*HandlerMethod$")) {
			webviewPreHandler = (WebviewPreHandler) ((HandlerMethod)handler).getBean();
		}else {
			webviewPreHandler = (WebviewPreHandler) handler;
		}	
		
		return super.preHandle(request, response, handler);
	}
}
