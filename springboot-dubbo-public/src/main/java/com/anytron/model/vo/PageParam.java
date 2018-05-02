package com.anytron.model.vo;

import java.io.Serializable;

/**
 * 类名: PageParam
 * <br/>包名: com.ccm.model.request
 * <br/>作用: 分页参数 ,需要分页的地方继承该类即可
 * <br/>作者: YanPJ
 * <br/>日期: 2017年12月25日下午4:11:20
 * <br/>版本: @version V1.0
 */
public class PageParam implements Serializable {

	private static final long serialVersionUID = -6216514778626729475L;
	
	private int pageNum = 1;//页码
	private int pageSize = 100;//每页要显示的条数
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "PageParam [pageNum=" + pageNum + ", pageSize=" + pageSize + "]";
	}
	

}
