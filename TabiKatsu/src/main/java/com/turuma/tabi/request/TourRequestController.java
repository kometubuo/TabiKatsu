package com.turuma.tabi.request;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the tour request page.
 */
@Controller
@RequestMapping("/request")
public class TourRequestController {

	private static final String Root = "request/";
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String show(Locale locale, Model model) {
		
		
		
		return Root + "request";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String edit(Locale locale, Model model) {
		
		
		
		return Root + "request_edit";
	}
}
