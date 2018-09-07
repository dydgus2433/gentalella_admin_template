package com.my.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdditonalPages {
private static final String VIEW_PATH = "addtional_pages.";
	
	@RequestMapping( value = "/contacts", method = RequestMethod.GET)
	public String contacts(Model model){
		return VIEW_PATH + "contacts";
	}
	
	@RequestMapping( value = "/e_commerce", method = RequestMethod.GET)
	public String e_commerce(Model model){
		return VIEW_PATH + "e_commerce";
	}
	
	@RequestMapping( value = "/profile", method = RequestMethod.GET)
	public String profile(Model model){
		return VIEW_PATH + "profile";
	}
	
	@RequestMapping( value = "/project_detail", method = RequestMethod.GET)
	public String project_detail(Model model){
		return VIEW_PATH + "project_detail";
	}
	
	@RequestMapping( value = "/projects", method = RequestMethod.GET)
	public String projects(Model model){
		return VIEW_PATH + "projects";
	}
}
