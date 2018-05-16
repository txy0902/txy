package com.txy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@SuppressWarnings("unchecked")
@Service
public class OrderService {

	@Autowired
	RestTemplate restTemplate;
	
	public Map<String,Object> login(){
		return restTemplate.getForObject("http://service-member/login", Map.class);
	}
	
	public List<String> getAllMemberList(){
		return restTemplate.getForObject("http://service-member/getMemberAll", List.class);
	}
	
}
