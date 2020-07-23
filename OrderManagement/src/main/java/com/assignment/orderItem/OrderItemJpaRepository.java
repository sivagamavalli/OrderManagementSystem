package com.assignment.orderItem;

import org.springframework.data.repository.CrudRepository;

public interface OrderItemJpaRepository extends CrudRepository<OrderItem, Long> {

	public OrderItem findByProductCode(String productcode);
}
