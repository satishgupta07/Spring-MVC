package com.satish07.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","Satish Kumar Gupta");
		model.addAttribute("id",1421);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vandana");
		friends.add("Roshni");
		friends.add("Abhishek");
		
		model.addAttribute("f", friends);
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}
}
