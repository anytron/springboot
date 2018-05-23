package com.anytron.api.provider;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.anytron.api.ICourierProvider;
import com.anytron.model.po.TCourier;
import com.anytron.model.vo.PageParam;
import com.anytron.service.ICourierService;
import com.github.pagehelper.Page;

@Service(version="1.0.0",timeout=50000)
public class CourierProvider implements ICourierProvider {
	
	@Autowired
	ICourierService courierService;

	@Override
	public void addCourier(TCourier courier) {
		courierService.addCourier(courier);
	}

	@Override
	public Page<Object> getTCouriers(PageParam pp) {
		return courierService.getTCouriers(pp);
	}
	
	

}
