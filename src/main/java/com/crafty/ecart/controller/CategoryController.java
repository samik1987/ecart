package com.crafty.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crafty.ecart.entity.CategoryEntity;
import com.crafty.ecart.service.CategoryService;

@RestController
@RequestMapping("Category")
public class CategoryController {
	
	@Autowired
	private CategoryService _categoryService;
	
	@GetMapping("/")
	public String MyCart()
	{
		return "Welcome to Heartmadecrafts";
	}
	
	@GetMapping("/GetAllCategories")
	public List<CategoryEntity> GetAllCategories()
	{		
	  return  this._categoryService.GetAllCategories();
	}
	
	

}
