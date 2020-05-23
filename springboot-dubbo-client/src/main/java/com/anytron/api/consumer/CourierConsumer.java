package com.anytron.api.consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.anytron.api.ICourierProvider;
import com.anytron.model.po.TCourier;
import com.anytron.model.vo.PageParam;
import com.github.pagehelper.Page;

@RestController
@RequestMapping("/courier")
public class CourierConsumer {
	
	@Reference(version="1.0.0",url="dubbo://127.0.0.1:20880",timeout=10000)
	ICourierProvider courierProvider;
	

	@RequestMapping(value="/addCourier")
	@ResponseBody
	public void addCourier(TCourier courier) {
		courierProvider.addCourier(courier);
	}

	@RequestMapping(value="/getTCouriers")
	@ResponseBody
	public Page<Object> getTCouriers(PageParam pp) {
		return courierProvider.getTCouriers(pp);
	}

}
