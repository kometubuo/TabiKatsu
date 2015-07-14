package com.turuma.tabi.auth;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the tourist authentication page.
 */
@Controller
public class TouristAuthenticateController {

	@RequestMapping(value = "/auth/tourist", method = RequestMethod.GET)
	public String auth(Locale locale, Model model) {
		
		
		
		return "tourist_auth";
	}

}
