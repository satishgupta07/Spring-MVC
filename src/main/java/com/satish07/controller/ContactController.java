package com.satish07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.satish07.model.User;
import com.satish07.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Registration Form");
		m.addAttribute("Desc","Home for Programmer");
		
		System.out.println("adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("Creating Form");
		
		return "contact";
	}
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) { 
		
		System.out.println(user);
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		
		this.userService.createUser(user);
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg","User created with id "+createdUser);
		return "success";
	}

}
 