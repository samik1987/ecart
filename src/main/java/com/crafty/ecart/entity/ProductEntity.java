package com.crafty.ecart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Products")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long ProductId;
	
	public String ProductName;
	
	@Lob
	@Column(columnDefinition = "TEXT")
	public String ProductDescription;
	
	public int ProductRating;
	
	@Lob
	@Column(columnDefinition = "TEXT")
	public String ProductReview;
	
	@Lob
	@Column(columnDefinition = "BLOB")
	public Byte[] ProductImage;
	
	
	//public Long CategoryId;	
	
    @ManyToOne(fetch = FetchType.EAGER)  
    public CategoryEntity category;
	

}
