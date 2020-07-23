package com.assignment.orderItem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceClass {

	@Autowired
	private OrderItemJpaRepository orderitemrepository;
	
	public List<OrderItem> getAllOrderItems(){
		List<OrderItem> orderitems = new ArrayList<>();
		orderitemrepository.findAll().forEach(orderitems::add);
		return orderitems;
	}
	
	public void addorderItem(OrderItem orderitem) {
		orderitemrepository.save(orderitem);
	}
	
	public OrderItem getOrderItemByCode(String productcode) {
		//OrderItem item = new OrderItem();
		return orderitemrepository.findByProductCode(productcode);
	}
	
	
}
