package com.turuma.tabi.auth;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the hotel authentication page.
 */
@Controller
@RequestMapping("/auth")
public class HotelAuthenticateController {
	
	private static final String Root = "auth/";
	
	@RequestMapping(value = "/hotel", method = RequestMethod.GET)
	public String auth(Locale locale, Model model) {
		
		
		
		return Root + "hotel_auth";
	}

}
