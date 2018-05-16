package com.txy.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.txy.fegin.MyFegin;

@Component
public class MyFeignFallback implements MyFegin{

	@Override
	public List<String> getMemberAll() {
		List<String> list = new ArrayList<String>();
		list.add("服务发生异常");
		return list;
	}
}
