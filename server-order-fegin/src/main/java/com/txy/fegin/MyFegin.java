package com.txy.fegin;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.txy.fallback.MyFeignFallback;

@FeignClient(value = "service-member",fallback=MyFeignFallback.class)
public interface MyFegin {

	@RequestMapping("/getMemberAll")
	public List<String> getMemberAll();
	
}
