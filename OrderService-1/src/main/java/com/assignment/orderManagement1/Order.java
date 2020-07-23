package com.assignment.orderManagement1;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String customerName;
	private Date orderDate;
	private String address;
	private String orderItem;
	private BigDecimal total;
	public Order() {
		super();
		
	}
	public Order(Long id, String customerName, Date orderDate, String address, String orderItem, BigDecimal total) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.address = address;
		this.orderItem = orderItem;
		this.total = total;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
	
	

}
