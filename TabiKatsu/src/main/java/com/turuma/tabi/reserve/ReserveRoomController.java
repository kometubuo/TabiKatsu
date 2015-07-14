package com.turuma.tabi.reserve;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the reserve room page.
 */
@Controller
@RequestMapping("/reserve")
public class ReserveRoomController {

	private static final String Root = "reserve/";
	
	@RequestMapping(method = RequestMethod.GET)
	public String reserve(Locale locale, Model model) {
		
		
		
		return Root + "reserve";
	}

	@RequestMapping(value = "/confirm/hotel", method = RequestMethod.GET)
	public String confirmHotel(Locale locale, Model model) {
		
		
		
		return Root + "confirm_hotel_reserve";
	}

	@RequestMapping(value = "/confirm/tourist", method = RequestMethod.GET)
	public String confirmTourist(Locale locale, Model model) {
		
		
		
		return Root + "confirm_tourist_reserve";
	}
}
