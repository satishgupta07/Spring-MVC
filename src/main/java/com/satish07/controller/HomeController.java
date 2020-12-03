package com.satish07.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help contoller");
		
		//Creating ModelAndView Object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name", "Uttam Shukla");
		modelAndView.addObject("rollno", 12414);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3434);
		list.add(2134);
		list.add(2345);
		
		modelAndView.addObject("marks",list);
		
		//setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
