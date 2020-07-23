package com.assignment.orderManagement1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.google.common.reflect.TypeToken;



@RestController
@EnableDiscoveryClient
public class OrderController {

	@Autowired
	private OrderServiceClass orderservice;
	
	@Autowired
	private OrderItemProxy orderitemclient;
	
	@RequestMapping("/orders")
	public List<Order> getOrders(){
		//List<OrderItem> result = new ArrayList<OrderItem>();
		return orderservice.getAllOrders();
	}
		
	@RequestMapping(method=RequestMethod.POST, value="/addOrder")
	public void addOrder(@RequestBody Order order) {
		orderservice.addorder(order);
	}
	
	@RequestMapping("/orders/{productcode}")
	public List<Order> getOrderByProductCode(@PathVariable String productcode){
		//List<OrderItem> result = new ArrayList<OrderItem>();
		List <Order> order = new ArrayList<Order>();
		String orderItem = null;
//		order=orderservice.getAllOrders();
//		return orderservice.getOrderItemByProductCode(productcode);
		CustomOrderItemObject custombean = new CustomOrderItemObject();
		custombean=orderitemclient.getOrderItembyProductCode(productcode);
		order=orderservice.getAllOrders();
        return order;
	   
	    
	}
	
	
}
