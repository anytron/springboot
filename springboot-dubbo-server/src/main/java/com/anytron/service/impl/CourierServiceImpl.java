package com.anytron.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anytron.mapper.CourierMapper;
import com.anytron.model.po.TCourier;
import com.anytron.model.vo.PageParam;
import com.anytron.service.ICourierService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class CourierServiceImpl implements ICourierService {

	@Autowired
	CourierMapper courierMapper;

	@Override
	public void addCourier(TCourier courier) {
		courierMapper.insert(courier);
	}

	@Override
	public Page<Object> getTCouriers(PageParam pp) {
		Page<Object> page = PageHelper.startPage(pp.getPageNum(), pp.getPageSize(), true);
		courierMapper.selectAll();
		return page;
	}
	
	

}
