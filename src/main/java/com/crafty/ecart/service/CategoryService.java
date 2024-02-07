package com.crafty.ecart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crafty.ecart.entity.CategoryEntity;


public interface CategoryService {
	
	public List<CategoryEntity> GetAllCategories();
	
	public CategoryEntity GetCategoryById(Long id);
	
	public CategoryEntity AddCategory(CategoryEntity category);
	
	public CategoryEntity UpdateCategory(CategoryEntity category);
	
	public Boolean DeleteCategoryById(Long id);

}
