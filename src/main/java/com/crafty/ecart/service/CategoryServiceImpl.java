package com.crafty.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crafty.ecart.dao.CategoryDao;
import com.crafty.ecart.entity.CategoryEntity;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDao _categoryDao;

	@Override
	public List<CategoryEntity> GetAllCategories() {
		
		return this._categoryDao.findAll();
	}
	
	

}
