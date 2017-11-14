package com.lmig.gcf.rentals.randomnumbergenerator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gcf.rentals.randomnumbergenerator.models.RandomNumber;

@Controller
public class RandomNumberGenerator {

	// Private Variable
	private RandomNumber rn;

	// Constructor
	public RandomNumberGenerator() {
		rn = new RandomNumber();
	}

	// Request Mapping for Default
	@RequestMapping("/")
	public ModelAndView defaultPage() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("random");
		return mv;
	}

	// Request Mapping for Generating Random Number
	@RequestMapping("/random")
	public ModelAndView showRandomNumberPage(int max) {

		if (max > 0) {
			rn.calculateRandomNumber(max);
			System.out.println("Max Number: " + max + " Result: " + rn.getResult());
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("random");
		mv.addObject("rn", rn);
		return mv;
	}
	
}
