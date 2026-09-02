package com.example.portfolio.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PortfolioController{
	@GetMapping("/start")
	public String Start() {
		return "redirect:/portfolio";
	}
	@GetMapping("/portfolio")
	public String Portfolio() {
		return "portfolio";
	}
}