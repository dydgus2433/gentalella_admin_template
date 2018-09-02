package com.kt.membership.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Define {
	
	public static final Logger ADAPTER_LOGGER	=	LoggerFactory.getLogger("ADAPTER");
	public static final Logger TRACE_LOGGER		=	LoggerFactory.getLogger("TRACE");
	public static final Logger SERVICE_LOGGER	=	LoggerFactory.getLogger("SERVICE");
	
	public static final int SUCCESS_CODE = 0;
	public static final String SUCCESS_MESSAGE = "성공";
	public static final String ERROR_MESSAGE = "알 수 없는 오류(실제 서비스에서는 그럴듯하게 바꿔)";
	public static final Integer ERROR_CODE = 9999;
	public static final int SERVER_IS_NOT_AVAILABLE_CODE = 1007; //서버점검
	public static final String SERVER_IS_NOT_AVAILABLE_MESSAGE = "서버점검";
	public static final int APP_UPDATE_ERROR_CODE = 1005;
	public static final Object APP_UPDATE_ERROR_MESSAGE = "강제 업데이트";
	
}
