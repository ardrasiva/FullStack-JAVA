package com.example.photography.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PhotographyController{
	@GetMapping("/start")
	public String Start() {
		return "redirect:/welcome";
	}
	
	@GetMapping("/welcome")
	public String Welcome() {
		return "welcome";
	}
}