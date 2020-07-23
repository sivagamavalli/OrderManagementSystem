package com.assignment.orderItem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@EnableFeignClients("com.assignment.orderItem")
@SpringBootApplication
public class OrderItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderItemServiceApplication.class, args);
	}

}
