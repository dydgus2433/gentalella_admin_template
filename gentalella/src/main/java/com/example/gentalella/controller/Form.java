package com.example.gentalella.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Form {
	private static final String VIEW_PATH = "form.";
	
	@RequestMapping( value = "/form_advanced", method = RequestMethod.GET)
	public String form_advanced(Model model){
		return VIEW_PATH + "form_advanced";
	}
	
	@RequestMapping( value = "/form_buttons", method = RequestMethod.GET)
	public String form_buttons(Model model){
		return VIEW_PATH + "form_buttons";
	}
	
	@RequestMapping( value = "/form_upload", method = RequestMethod.GET)
	public String form_upload(Model model){
		return VIEW_PATH + "form_upload";
	}
	
	@RequestMapping( value = "/form_validation", method = RequestMethod.GET)
	public String form_validation(Model model){
		return VIEW_PATH + "form_validation";
	}
	
	@RequestMapping( value = "/form_wizards", method = RequestMethod.GET)
	public String form_wizards(Model model){
		return VIEW_PATH + "form_wizards";
	}
	
	@RequestMapping( value = "/form", method = RequestMethod.GET)
	public String form(Model model){
		return VIEW_PATH + "form";
	}
}
