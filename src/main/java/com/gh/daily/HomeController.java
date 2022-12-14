package com.gh.daily;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@GetMapping("/")
	public String home() {
		logger.info("Welcome home!");
		
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		logger.info("login page");
		
		return "login";
	}
	
	@GetMapping("/join")
	public String join() {
		logger.info("join page");
		
		return "join";
	}
	
}
