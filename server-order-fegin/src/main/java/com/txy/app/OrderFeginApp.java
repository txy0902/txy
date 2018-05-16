package com.txy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.txy"})
@EnableFeignClients(basePackages = {"com.txy.fegin"})
public class OrderFeginApp {

	public static void main(String[] args) {
		SpringApplication.run(OrderFeginApp.class, args);
	}
}
