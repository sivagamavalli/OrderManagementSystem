package com.assignment.orderManagement1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceClass {

	
	@Autowired
	private OrderJpaRepository orderrepository;
	
	@Autowired
	private OrderItemProxy orderitemproxy;
	
	public List<Order> getAllOrders(){
		List<Order> orders = new ArrayList<>();
		orderrepository.findAll().forEach(orders::add);
		return orders;
	}
	
	public void addorder(Order order) {
		orderrepository.save(order);
	}
	
	public List<Order> getOrderItemByProductCode(String productcode){
		List<Order> orders = new ArrayList<>();
		orderitemproxy.getOrderItembyProductCode(productcode);
		//orderrepository.findAll().forEach(orders::add);
		return orders;
	}

	
}
