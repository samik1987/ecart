package com.crafty.ecart.service;

import java.io.Console;
import java.util.List;
import java.util.Optional;

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

	@SuppressWarnings("deprecation")
	@Override
	public CategoryEntity GetCategoryById(Long id) {
	
		System.out.println(id);
		//System.out.println(this._categoryDao.findById(id).get().CategoryDescription);
		//System.out.println(this._categoryDao.getOne(id).CategoryDescription);
		
		return this._categoryDao.findById(id).get();
	}

	@Override
	public CategoryEntity AddCategory(CategoryEntity category) 
	{
		
		return this._categoryDao.save(category);
	}

	
	@Override
	public CategoryEntity UpdateCategory(CategoryEntity category) {
		
		System.out.println(category.CategoryDescription);
	    this._categoryDao.save(category);
		
		return category;
	}

	@Override
	public Boolean DeleteCategoryById(Long id) {
		
		if(this._categoryDao.existsById(id))
		{
		 this._categoryDao.deleteById(id);
		 
		 return true;
		}
		else
			return false;
	}
	
	

}
