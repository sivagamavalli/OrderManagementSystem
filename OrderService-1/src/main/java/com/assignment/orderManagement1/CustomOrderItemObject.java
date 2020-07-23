package com.assignment.orderManagement1;

import java.math.BigDecimal;
import java.sql.Date;

public class CustomOrderItemObject {
	
	
	private String productCode;
	private String productName;
	private Long quantity;
	
	
	public CustomOrderItemObject() {
		super();
	}
	
	

	public CustomOrderItemObject( String productCode,
			String productName, Long quantity) {
		super();
		
		this.productCode = productCode;
		this.productName = productName;
		this.quantity = quantity;
		
	}



	

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}


	
	
}
