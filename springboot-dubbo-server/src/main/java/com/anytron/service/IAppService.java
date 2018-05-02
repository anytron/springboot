package com.anytron.service;

import java.util.Map;

import com.anytron.model.vo.PageParam;

public interface IAppService {
	
	public Map<String, Object> getApps(PageParam pp);
}
