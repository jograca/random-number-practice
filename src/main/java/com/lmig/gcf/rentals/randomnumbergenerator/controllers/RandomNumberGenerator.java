package com.lmig.gcf.rentals.randomnumbergenerator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RandomNumberGenerator {

	@RequestMapping("/")
	public ModelAndView defaultPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("random");
		
		return mv;
	}
	
	@RequestMapping("/random")
	public ModelAndView showwRandomNumberPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("random");
		
		return mv;
	}
}
