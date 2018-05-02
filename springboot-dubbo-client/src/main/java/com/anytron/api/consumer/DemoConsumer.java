package com.anytron.api.consumer;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.anytron.api.ISpringBootDemoProvider;
import com.anytron.model.vo.Demo;
import com.anytron.model.vo.PageParam;

@RestController
@RequestMapping("/demo")
public class DemoConsumer {
	
	@Reference(version="1.0.0",url="dubbo://127.0.0.1:20880",timeout=10000)
	ISpringBootDemoProvider demoProvider;
	
	@RequestMapping(value="/getDemo")
	@ResponseBody
	public Demo getDemo(String name) {
		return demoProvider.getDemo(name);
	}
	
	@RequestMapping(value="/getapps")
	@ResponseBody
	public Map<String, Object> getDemo(PageParam pp) {
		return demoProvider.getApps(pp);
	}

}
