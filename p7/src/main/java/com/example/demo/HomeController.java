package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping("/login")
	public String login(Model model,String account, String password) {
		/*
		 * if ("abc".equals(account) && "123".equals(password)) return "home"; else
		 * return "index";
		 */
		return "home";
	}
}

