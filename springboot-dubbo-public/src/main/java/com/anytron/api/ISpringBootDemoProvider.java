package com.anytron.api;

import java.util.Map;

import com.anytron.model.vo.Demo;
import com.anytron.model.vo.PageParam;

public interface ISpringBootDemoProvider {
	
	public Demo getDemo(String name);
	
	public Map<String,Object> getApps(PageParam pp);
	
}
