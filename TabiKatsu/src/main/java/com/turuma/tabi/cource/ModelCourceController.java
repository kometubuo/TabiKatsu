package com.turuma.tabi.cource;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the model cource page.
 */
@Controller
@RequestMapping("/cource")
public class ModelCourceController {

	private static final String Root = "cource/";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String show(Locale locale, Model model) {
		
		
		
		return Root + "cource";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String edit(Locale locale, Model model) {
		
		
		
		return Root + "cource_edit";
	}
}
