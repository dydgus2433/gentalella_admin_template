package com.my.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Common {
	
	final static String VIEW_PATH = "";
	

	@RequestMapping( value = "/login", method = RequestMethod.GET)
	public String login(Model model){
		return VIEW_PATH + "login";
	}
	
	@RequestMapping( value = "/page_403", method = RequestMethod.GET)
	public String page_403(Model model){
		return VIEW_PATH + "page_403";
	}
	
	@RequestMapping( value = "/page_404", method = RequestMethod.GET)
	public String page_404(Model model){
		return VIEW_PATH + "page_404";
	}
	
	@RequestMapping( value = "/page_500", method = RequestMethod.GET)
	public String page_500(Model model){
		return VIEW_PATH + "page_500";
	}
	
}
