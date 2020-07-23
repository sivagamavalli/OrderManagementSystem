package com.assignment.orderManagement1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderJpaRepository extends CrudRepository<Order, Long>{

	public List<Order> findByOrderItem(String orderitem);
}
