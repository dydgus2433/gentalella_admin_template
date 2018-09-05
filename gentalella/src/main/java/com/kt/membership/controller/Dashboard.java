package com.kt.membership.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class Dashboard {
	
	private static final String VIEW_PATH = "dashboard.";
	
	@RequestMapping( value = "/", method = RequestMethod.GET)
	public String index(Model model){
		return VIEW_PATH + "dashboard";
	}

	@RequestMapping( value = {"/dashboard","/index"}, method = RequestMethod.GET)
	public String dashboard(Model model){
		return VIEW_PATH + "dashboard";
	}
	
	@RequestMapping( value = "/dashboard2", method = RequestMethod.GET)
	public String dashboard2(Model model){
		return VIEW_PATH + "dashboard2";
	}
	
	@RequestMapping( value = "/dashboard3", method = RequestMethod.GET)
	public String dashboard3(Model model){
		return VIEW_PATH + "dashboard3";
	}
}
