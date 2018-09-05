package com.kt.membership.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Chart {
private static final String VIEW_PATH = "chart.";
	
	@RequestMapping( value = "/chartjs", method = RequestMethod.GET)
	public String chartjs(Model model){
		return VIEW_PATH + "chartjs";
	}
	
	@RequestMapping( value = "/chartjs2", method = RequestMethod.GET)
	public String chartjs2(Model model){
		return VIEW_PATH + "chartjs2";
	}
	
	@RequestMapping( value = "/echarts", method = RequestMethod.GET)
	public String echarts(Model model){
		return VIEW_PATH + "echarts";
	}
	
	@RequestMapping( value = "/morisjs", method = RequestMethod.GET)
	public String morisjs(Model model){
		return VIEW_PATH + "morisjs";
	}
	
	@RequestMapping( value = "/other_charts", method = RequestMethod.GET)
	public String other_charts(Model model){
		return VIEW_PATH + "other_charts";
	}
}
