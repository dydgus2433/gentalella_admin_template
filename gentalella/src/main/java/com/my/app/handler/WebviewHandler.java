package com.my.app.handler;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class WebviewHandler {
	@Autowired
	private ObjectFactory<SessionContext> sessionContextFactory;

	public SessionContext getSession() {
		SessionContext sessionContext  = (SessionContext) sessionContextFactory.getObject();
		return sessionContext;
	}

	
	
}
