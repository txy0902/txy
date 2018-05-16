package com.txy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.txy.service.OrderService;


@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping("/login")
	public Map<String,Object> login(){
		System.out.println("登录开始:");
		return orderService.login();
	}
	
	@RequestMapping("/getMemberAll")
	public List<String> getAllMemberList(){
		System.out.println("获取用户开始");
		return orderService.getAllMemberList();
	}
}
