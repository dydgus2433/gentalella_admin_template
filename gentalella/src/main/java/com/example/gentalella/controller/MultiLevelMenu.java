package com.example.gentalella.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MultiLevelMenu {
	
	private static final String VIEW_PATH = "multi.";
	
	
	@RequestMapping( value = "/level1", method = RequestMethod.GET)
	public String level1(Model model){
		return VIEW_PATH + "level1";
	}
	@RequestMapping( value = "/level2", method = RequestMethod.GET)
	public String level2(Model model){
		return VIEW_PATH + "level2";
	}
	@RequestMapping( value = "/level3", method = RequestMethod.GET)
	public String level3(Model model){
		return VIEW_PATH + "level3";
	}
}
