package com.anytron.model.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_courier")
public class TCourier implements Serializable {
	
	private static final long serialVersionUID = 3663739557833757158L;
	
	/** courier_id **/
	@Id
	@Column(name = "courier_id")
	private Long courier_id;
	/** 配送员 **/
	@Column(name = "courier_name")
	private String courier_name;
	/** 手机号 **/
	@Column(name = "courier_phone")
	private Long courier_phone;
	/** 商家id **/
	@Column(name = "seller_id")
	private Long seller_id;
	/** 配送员创建时间 **/
	@Column(name = "courier_creat_time")
	private Date courier_creat_time;
	/** 更新时间 **/
	@Column(name = "courier_update_time")
	private Date courier_update_time;

	/**
	 * 返回: courier_id
	 **/
	public Long getCourier_id() {
		return courier_id;
	}

	/**
	 * 设置: courier_id
	 **/
	public void setCourier_id(Long courier_id) {
		this.courier_id = courier_id;
	}

	/**
	 * 返回: 配送员
	 **/
	public String getCourier_name() {
		return courier_name;
	}

	/**
	 * 设置: 配送员
	 **/
	public void setCourier_name(String courier_name) {
		this.courier_name = courier_name;
	}

	/**
	 * 返回: 手机号
	 **/
	public Long getCourier_phone() {
		return courier_phone;
	}

	/**
	 * 设置: 手机号
	 **/
	public void setCourier_phone(Long courier_phone) {
		this.courier_phone = courier_phone;
	}

	/**
	 * 返回: 商家id
	 **/
	public Long getSeller_id() {
		return seller_id;
	}

	/**
	 * 设置: 商家id
	 **/
	public void setSeller_id(Long seller_id) {
		this.seller_id = seller_id;
	}

	/**
	 * 返回: 配送员创建时间
	 **/
	public Date getCourier_creat_time() {
		return courier_creat_time;
	}

	/**
	 * 设置: 配送员创建时间
	 **/
	public void setCourier_creat_time(Date courier_creat_time) {
		this.courier_creat_time = courier_creat_time;
	}

	/**
	 * 返回: 更新时间
	 **/
	public Date getCourier_update_time() {
		return courier_update_time;
	}

	/**
	 * 设置: 更新时间
	 **/
	public void setCourier_update_time(Date courier_update_time) {
		this.courier_update_time = courier_update_time;
	}

	@Override
	public String toString() {
		return "TCourier: ["+"courier_id="+courier_id+",courier_name="+courier_name+",courier_phone="+courier_phone+",seller_id="+seller_id+",courier_creat_time="+courier_creat_time+",courier_update_time="+courier_update_time+"]";
	}
}
