package com.cts.review_service.entity;

import javax.persistence.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name="Product")
@ApiModel(description="This is the product model")
public class Products {
	@ApiModelProperty(value = "A unique key for each product")
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="p_id")
	private int productId;
	
	@Column(name="p_name")
	@ApiModelProperty(value = "Name of the product")
	private String productName;
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Products() {
		super();
	}
	
	public Products(int productId) {
		super();
		this.productId=productId;
	}
}