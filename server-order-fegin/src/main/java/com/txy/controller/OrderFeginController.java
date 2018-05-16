package com.txy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.txy.fegin.MyFegin;
import com.txy.fegin.MyFegin2;

@RestController
public class OrderFeginController {
	
	@Autowired
	private MyFegin myFegin;
	
	@Autowired
	private MyFegin2 myFegin2;

	@RequestMapping("/getMemberAll")
	public List<String> getMemberAll(){
		System.out.println("1====================Fegin");
		return myFegin.getMemberAll();
	}
	
	@RequestMapping("/login")
	public Map<String,Object> isLogin(){
		System.out.println("2====================Fegin");
		return myFegin2.isLogin();
	}
	
	@RequestMapping("/test")
	public String test(){
		System.out.println("3======================非fegin");
		return "test";
	}
	
}
