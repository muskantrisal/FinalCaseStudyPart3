package com.inventory;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.inventory.Services.UserOrderService;
import com.inventory.entities.OrderItem;
import com.inventory.entities.Orders;

@SpringBootApplication(scanBasePackages = "com.inventory")
@EnableJpaRepositories(basePackages = "com.inventory.Dao")
@EntityScan(basePackages = "com.inventory.entities")
public class UserOrderApplication{
	
	
	public static void main(String[] args) {
		SpringApplication.run(UserOrderApplication.class, args);
	}
	
	

}
