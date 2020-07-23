package com.assignment.orderManagement1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("com.assignment.orderManagement1")
public class OrderService1Application {

	public static void main(String[] args) {
		SpringApplication.run(OrderService1Application.class, args);
	}

}
