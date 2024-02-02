package com.crafty.ecart.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "Categories")
public class CategoryEntity {
	
	@Id
	@GeneratedValue
	public Long CategoryId;	
	
	public String CategoryName;
	
	@Lob
	@Column(columnDefinition = "TEXT")
	public String CategoryDescription;	
	
	@Lob
	@Column(columnDefinition = "BLOB")
	public Byte[] CategoryImage;	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY ,mappedBy = "category")  
	public List<ProductEntity> products;

}
