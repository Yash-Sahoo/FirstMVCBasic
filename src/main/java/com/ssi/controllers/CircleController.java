package com.ssi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.models.Circle;
import com.ssi.services.CircleService;

@Controller
public class CircleController {

	@RequestMapping("circleentry")
	public String circleInput() {
		return "circleinput.jsp";
	}
	
	@RequestMapping("CalculateCircle")
	public ModelAndView processCircle(@RequestParam("radius") double radius) {
		CircleService circleService=new CircleService();
		Circle circle=circleService.calculate(radius);
		
		ModelAndView mv=new ModelAndView("result.jsp");
		mv.addObject("resultdata",circle);
		mv.addObject("author","Yash");
		return mv;
	}
}
