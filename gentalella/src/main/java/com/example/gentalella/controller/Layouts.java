package com.example.gentalella.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Layouts {

private static final String VIEW_PATH = "layouts.";
	
	@RequestMapping( value = "/fixed_footer", method = RequestMethod.GET)
	public String fixed_footer(Model model){
		return VIEW_PATH + "fixed_footer";
	}
	
	@RequestMapping( value = "/fixed_sidebar", method = RequestMethod.GET)
	public String fixed_sidebar(Model model){
		return VIEW_PATH + "fixed_sidebar";
	}

}
