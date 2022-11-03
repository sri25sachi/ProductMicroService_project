package com.mkj.gtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mkj.gtest.entity.Product;

@Service
public interface ProductService {
	public List<Product> getAllProducts() throws Exception;
	public Product getProductByProductCode(int productCode) throws Exception;
	public Product getProductByProductName(String productName) throws Exception;
	public List<Product> getProductByCategory(String category) throws Exception;
	public List<Product> getProductsByCategoryAndPriceRangeAndDealerName(String category , float price1, float price2 , String dealerName) throws Exception;
	public List<Product> getAllProductsByDealerName(String dealerName) throws Exception;
	public List<Product> getAllProductsByCategoryAndPriceAndUserRating(String category, float price, float userrating) throws Exception;
	
	public String insertProduct(Product product)throws Exception;
	
}
