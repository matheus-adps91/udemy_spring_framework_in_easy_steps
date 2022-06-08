package com.neptum.spring.springcoreadvanced.standalone.collections;

import java.util.List;

class ProductList 
{
	List<String> productNames;
	
	public ProductList() {
	}

	public ProductList(List<String> productName) {
		this.productNames = productName;
	}

	public List<String> getProductName() {
		return productNames;
	}

	public void setProductNames(List<String> productName) {
		this.productNames = productName;
	}

	@Override
	public String toString() {
		return "ProductList [productName=" + productNames + "]";
	}
}