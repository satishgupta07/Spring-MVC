package com.satish07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.satish07.model.User;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email, 
			                 @RequestParam("userName") String userName,
			                 @RequestParam("password") String password,
			                 Model model) { 
		
		System.out.println("User Email : "+email);
		System.out.println("User Name : "+userName);
		System.out.println("User Password : "+password);
		
		User user = new User();
		user.setEmail(email);
		user.setUserName(userName);
		user.setPassword(password);
		
		System.out.println(user);
		
		//process data
		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);
		
		model.addAttribute("user",user);
		
		return "success";
	}

}
 