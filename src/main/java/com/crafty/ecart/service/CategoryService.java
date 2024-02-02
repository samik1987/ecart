package com.crafty.ecart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crafty.ecart.entity.CategoryEntity;


public interface CategoryService {
	
	public List<CategoryEntity> GetAllCategories();

}
