package com.txy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {

	@Value("${server.port}")
	private String serverPort;
	
	@RequestMapping("/getMemberAll")
	public List<String> getMemberAll(){
		
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(serverPort);
		List<String> userList = new ArrayList<String>();
		userList.add("张三");
		userList.add("李四");
		userList.add("王五");
		userList.add("赵六");
		userList.add(serverPort);

		return userList;
	}


	@RequestMapping("/login")
	public Map<String,Object> isLogin(){
		System.out.println(serverPort);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("success", true);
		return map;
	}

}
