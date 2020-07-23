package com.assignment.orderItem;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="orderitem-service", url="localhost:8000")  
public interface orderItemClient {

	
	@RequestMapping("/orderitems")
	public List<OrderItem> getorderitems();
	
	@RequestMapping(method=RequestMethod.POST, value="/addOrderItem")
	public void addOrderItem(@RequestBody OrderItem orderitem);
}
