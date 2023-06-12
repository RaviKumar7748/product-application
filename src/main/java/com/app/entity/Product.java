package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCT_TAB")
public class Product {
	@Id
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "PRODUCT_COST")
	private Double productCost;
	@Column(name = "PRODUCT_VENDER")
	private String productVender;
	@Column(name = "PRODUCT_DESCRIPTION")
    private String productDescription; 
}
