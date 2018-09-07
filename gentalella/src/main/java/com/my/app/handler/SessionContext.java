package com.my.app.handler;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component("sessionContext")
public class SessionContext implements Serializable{

	
	private String homeUrl;
	
	private String menuList;
	
	private final Map<String, String> userMessage = new HashMap<>();
	
	public void clearUserMessage() {
		userMessage.clear();
	}

	public String getHomeUrl() {
		return homeUrl;
	}

	public void setHomeUrl(String homeUrl) {
		this.homeUrl = homeUrl;
	}

	public String getMenuList() {
		return menuList;
	}

	public void setMenuList(String menuList) {
		this.menuList = menuList;
	}

	public Map<String, String> getUserMessage() {
		return userMessage;
	}
	public String getUserMessage(String key) {
		return userMessage.get(key);
	}
	
}
