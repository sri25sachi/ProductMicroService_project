package com.mkj.gtest.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productCode;
    private String productName;
    private float price;
    private String dealerName;
    private String category;
    private float userRating;
    
    public Product(String productName, float price, String dealerName,String category,float userrating) {
		super();
		
		this.category = category;
		this.productName = productName;
		this.price = price;
		this.dealerName = dealerName;
		userRating = userrating;
	}
	

}
