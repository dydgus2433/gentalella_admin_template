package com.example.gentalella.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UiElements {
	private final String VIEW_PATH = "ui.";
	
	@RequestMapping( value = "/calendar", method = RequestMethod.GET)
	public String calendar(Model model){
		return VIEW_PATH + "calendar";
		
	}
	
	@RequestMapping( value = "/general_elements", method = RequestMethod.GET)
	public String general_elements(Model model){
		return VIEW_PATH + "general_elements";
	}
	
	@RequestMapping( value = "/glyphicons", method = RequestMethod.GET)
	public String glyphicons(Model model){
		return VIEW_PATH + "glyphicons";
	}
	@RequestMapping( value = "/icons", method = RequestMethod.GET)
	public String icons(Model model){
		return VIEW_PATH + "icons";
	}
	@RequestMapping( value = "/inbox", method = RequestMethod.GET)
	public String inbox(Model model){
		return VIEW_PATH + "inbox";
	}
	@RequestMapping( value = "/invoice", method = RequestMethod.GET)
	public String invoice(Model model){
		return VIEW_PATH + "invoice";
	}
	@RequestMapping( value = "/media_gallery", method = RequestMethod.GET)
	public String media_gallery(Model model){
		return VIEW_PATH + "media_gallery";
	}
	@RequestMapping( value = "/typography", method = RequestMethod.GET)
	public String typography(Model model){
		return VIEW_PATH + "typography";
	}
	@RequestMapping( value = "/widgets", method = RequestMethod.GET)
	public String widgets(Model model){
		return VIEW_PATH + "widgets";
	}
}
