package com.crafty.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crafty.ecart.entity.CategoryEntity;
import com.crafty.ecart.service.CategoryService;

import jakarta.websocket.server.PathParam;

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
	
	@GetMapping("/GetCategoryById/{id}")
	public CategoryEntity GetCategoryById(@PathVariable Long id)
	{		
	  System.out.println(id);
	  return  this._categoryService.GetCategoryById(id);
	}
	
	@PostMapping("/AddCategory")
	public CategoryEntity AddCategory(@RequestBody CategoryEntity categoryEntity)
	{		
	  return  this._categoryService.AddCategory(categoryEntity);
	}
	
	@PutMapping("/UpdateCategory")
	public CategoryEntity UpdateCategory(@RequestBody  CategoryEntity categoryEntity)
	{		
	  System.out.println(categoryEntity.CategoryDescription);
	  return  this._categoryService.UpdateCategory(categoryEntity);
	}
	
	@DeleteMapping("/DeleteCategoryById/{id}")
	public Boolean DeleteCategoryById(@PathVariable Long id)
	{		
	  return  this._categoryService.DeleteCategoryById(id);
	}
	
	
	
	

}
