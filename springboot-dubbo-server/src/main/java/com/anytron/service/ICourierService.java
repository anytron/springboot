package com.anytron.service;

import com.anytron.model.po.TCourier;
import com.anytron.model.vo.PageParam;
import com.github.pagehelper.Page;

public interface ICourierService {

	void addCourier(TCourier courier);

	Page<Object> getTCouriers(PageParam pp);

}
