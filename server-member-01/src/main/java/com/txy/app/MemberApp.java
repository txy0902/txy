package com.txy.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.txy"})
public class MemberApp {

	public static void main(String[] args) {
		SpringApplication.run(MemberApp.class, args);
	}
}
