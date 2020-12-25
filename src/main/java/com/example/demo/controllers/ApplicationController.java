package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Repo.*;

import com.example.demo.models.*;

@Controller
public class ApplicationController {
	
	@Autowired
	LoginRepo loginrepo;
	
	@Autowired
	OrderRepo orderrepo;
	
	@Autowired
	RegisterRepo registerrepo;
	
	
	@RequestMapping("/")
	public String Index() {
		return "index";
	}
		
	
	@RequestMapping("/save-login")
	
	public String SaveLogin(@ModelAttribute Login l)
	{
		List<Login> logs = loginrepo.findByEmail(l.getEmail());
		
		if(logs.isEmpty()) {
			return "redirect:/register";
		}
		
		else if(logs.get(0).getPassword().equals(l.getPassword()))
		{
			return "redirect:/";
		}
		
		return "redirect:/login";
	
	}
	
	@PostMapping("/save-register")
	public String SaveRegister(	@ModelAttribute Register R,@RequestParam String confirmpassword,@RequestParam String password)
	{
		if(password.equals(confirmpassword))
		{
			
			Login L = new Login(R.getEmail(),R.getPassword());
			registerrepo.save(R);
			loginrepo.save(L);
			return "redirect:/";
		}
		else
			return "/register";
	}
	
	
	
	@PostMapping("/save-order")
	public String SaveOrder(@ModelAttribute Orderr o)
	{
		orderrepo.save(o);
		return "redirect:/order";
	}
	

	@RequestMapping("/checkout")
	public String CheckOut() {
		return "checkout";
	}
	
	
	
	@RequestMapping("/login")
	public String Login()
	{
		return "login";	
	}

	
	@RequestMapping("/contact")
	public String Contact()
	{
		return "contact";	
	}
	
	
	@RequestMapping("/order")
	public String Order()
	{
		return "order";	
	}
	
	
	@RequestMapping("/orders-list")
	public String OrdersList()
	{
		return "orders-list";	
	}
	
	
	@RequestMapping("/register")
	public String Register()
	{
		return "register";	
	}
	
	
	
	@RequestMapping("/restaurants")
	public String Restaurant()
	{
		return "restaurants";	
	}
	
	
	
	

}
