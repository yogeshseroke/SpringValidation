package com.springvalidation.test.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springvalidation.test.entity.LoginData;

@Controller
public class Mycontroller {
	@GetMapping("/form")
	public String openform(Model m) 
	{
		m.addAttribute("logindata",new LoginData());
		return "form";
	}
	
	//handler for process form
	@RequestMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData,BindingResult result)
	{
		
		if(result.hasErrors())
		{
			System.out.println(result);
			return "form";
		}
		System.out.println(loginData);
		return "success";
	}
}
