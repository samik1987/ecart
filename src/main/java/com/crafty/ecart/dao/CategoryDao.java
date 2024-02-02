package com.crafty.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crafty.ecart.entity.CategoryEntity;


public interface CategoryDao  extends JpaRepository<CategoryEntity, Long> {


}
