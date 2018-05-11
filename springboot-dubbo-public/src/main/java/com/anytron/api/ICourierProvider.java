package com.anytron.api;

import com.anytron.model.po.TCourier;
import com.anytron.model.vo.PageParam;
import com.github.pagehelper.Page;

public interface ICourierProvider {
	
	public void addCourier(TCourier courier);
	
	public Page<Object> getTCouriers(PageParam pp);
	
}
