package com.crafty.ecart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Category")
public class CategoryController {
	
	@GetMapping("/")
	public String MyCart()
	{
		return "Welcome to Heartmadecrafts";
	}
	
	

}
