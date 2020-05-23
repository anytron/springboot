package com.anytron.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anytron.mapper.AppMapper;
import com.anytron.model.po.TApp;
import com.anytron.model.vo.PageParam;
import com.anytron.service.IAppService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class AppServiceImpl implements IAppService {

	@Autowired
	AppMapper appMapper;
	
	@Override
	public Map<String, Object> getApps(PageParam pp) {
		Map<String, Object> map = new HashMap<>();
		try {
			Page<Object> page = PageHelper.startPage(pp.getPageNum(),pp.getPageSize(),true);
			List<TApp> apps = appMapper.selectAll();
			map.put("apps", apps);
			map.put("total", page.getTotal());
			map.put("pages", page.getPages());
			map.put("pageNum", page.getPageNum());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

}
