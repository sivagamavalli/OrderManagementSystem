package com.assignment.orderItem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class OrderItemController {
	
	@Autowired
	private OrderItemServiceClass orderitemservice;
	
	@Autowired
	private orderItemClient orderitemclient; 
	
@RequestMapping("/orderitems")
public List<OrderItem> getorderitems(){
	//List<OrderItem> result = new ArrayList<OrderItem>();
	return orderitemservice.getAllOrderItems();
}
	
@RequestMapping(method=RequestMethod.POST, value="/addOrderItem")
public void addOrderItem(@RequestBody OrderItem orderitem) {
	orderitemservice.addorderItem(orderitem);
}

@RequestMapping(method=RequestMethod.GET,value="/orderitems/{id}")
public OrderItem getOrderItembyProductCode(String productcode)
{
	return orderitemservice.getOrderItemByCode(productcode);
}
	
}
