package com.turuma.tabi.introduce;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the hotel introduce page.
 */
@Controller
@RequestMapping("/introduce")
public class HotelIntroduceController {

	private static final String Root = "introduce/";
	
	@RequestMapping(method = RequestMethod.GET)
	public String show(Locale locale, Model model) {
		
		
		
		return Root + "introduce";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String edit(Locale locale, Model model) {
		
		
		
		return Root + "introduce_edit";
	}
}
