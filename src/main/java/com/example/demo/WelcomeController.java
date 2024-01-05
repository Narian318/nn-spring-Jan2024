package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("message", "Deploy of Naren's Springboot war file on Tomcat server on AWS Elastic Bean Stack");
		return "welcome";
	}
}
