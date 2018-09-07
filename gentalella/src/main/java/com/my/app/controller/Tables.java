package com.my.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Tables {

	private final static String VIEW_PATH = "tables.";
	
	@RequestMapping( value = "/tables_dynamic", method = {RequestMethod.GET, RequestMethod.POST})
	public String tables_dynamic(Model model){
		
		return VIEW_PATH+ "tables_dynamic";
	}
	
	
	@RequestMapping(value = "tables", method = RequestMethod.GET)
	public String tables(Model model){		
		return VIEW_PATH + "tables";
	}
}
