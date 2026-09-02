package com.example.welcome.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController{
	@GetMapping("/welcome")
	public String Welcome() {
		return "welcome";
	}
}