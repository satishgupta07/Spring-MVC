package com.satish07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.satish07.model.User;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		m.addAttribute("Header", "Registration Form");
		m.addAttribute("Desc","Home for Programmer");
		return "contact";
	}
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) { 
		
		System.out.println(user);
		
		model.addAttribute("Header", "Registration Form");
		model.addAttribute("Desc","Home for Programmer");
		
		return "success";
	}

}
 