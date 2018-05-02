package com.anytron.api.provider;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.anytron.api.ISpringBootDemoProvider;
import com.anytron.model.vo.Demo;
import com.anytron.model.vo.PageParam;
import com.anytron.service.IAppService;

@Service(version="1.0.0")
public class DemoProvider implements ISpringBootDemoProvider {
	
	@Autowired
	IAppService appService;
	
	@Override
	public Demo getDemo(String name) {
		System.out.println("进来了");
		Demo demo = new Demo();
		if (StringUtils.isBlank(name)) {
			demo.setAge(10);
			demo.setName("abc");
		} else if ("aaa".equals(name)) {
			demo.setAge(20);
			demo.setName("bbb");
		} else {
			demo.setAge(30);
			demo.setName("ccc");
		}
		return demo;
	}

	@Override
	public Map<String, Object> getApps(PageParam pp) {System.out.println("afffffffffff");
		return appService.getApps(pp);
	}

}
