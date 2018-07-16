package com.synergy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")


public class Product {
	
	@Id
    private long ProductId;
	
	@Indexed(unique = true)
    private String productName;
    private String category;
    private String vendorName;
    private long price;
    private String imageUrl;
    private String starRating;
    
    
    
    
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long productId, String poductName, String category, String vendorName, long price, String imageUrl,
			String starRating) {
		super();
		ProductId = productId;
		this.productName = poductName;
		this.category = category;
		this.vendorName = vendorName;
		this.price = price;
		this.imageUrl = imageUrl;
		this.starRating = starRating;
	}

	public String getCategory() {
		return category;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getProductName() {
		return productName;
	}

	public long getPrice() {
		return price;
	}

	public long getProductId() {
		return ProductId;
	}

	public String getStarRating() {
		return starRating;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setProductName(String poductName) {
		this.productName = poductName;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void setProductId(long productId) {
		ProductId = productId;
	}

	public void setStarRating(String starRating) {
		this.starRating = starRating;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", productName=" + productName + ", category=" + category
				+ ", vendorName=" + vendorName + ", price=" + price + ", imageUrl=" + imageUrl + ", starRating="
				+ starRating + "]";
	}
   
	
	
	
	

}
