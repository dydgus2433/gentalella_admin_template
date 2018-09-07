package com.my.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Extras {
	final static String VIEW_PATH = "extras.";
	
	@RequestMapping( value = "/plain_page" , method = RequestMethod.GET)
	public String plain_page(Model model){
		return VIEW_PATH + "plain_page";
	}
	
	@RequestMapping( value = "/pricing_tables" , method = RequestMethod.GET)
	public String pricing_tables(Model model){
		return VIEW_PATH + "pricing_tables";
	}
	
}
