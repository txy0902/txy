package com.txy.fegin;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-member")
public interface MyFegin2 {

	@RequestMapping("/login")
	public Map<String,Object> isLogin();
}
