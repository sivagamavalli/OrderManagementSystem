package com.assignment.orderManagement1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@FeignClient(name="orderitem-service", url="localhost:8000")
public interface OrderItemProxy {

	
	@RequestMapping(method=RequestMethod.GET,value="/orderitems/{id}")
	public CustomOrderItemObject getOrderItembyProductCode(String productcode);
}
