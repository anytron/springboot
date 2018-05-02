package com.anytron.model.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "\"T_APP\"")
public class TApp implements Serializable {
	private static final long serialVersionUID = -5896950231874719993L;
	/** vAppCode **/
	@Id
	@Column(name = "v_app_code")
	private String vAppCode;
	/** vAppName **/
	@Column(name = "v_app_name")
	private String vAppName;
	/** vDomainId **/
	@Column(name = "v_domain_name")
	private String vDomainName;
	/** vDomainId **/
	@Column(name = "ts_create_time")
	private Date tsCreateTime;
	/** vDomainId **/
	@Column(name = "ts_update_time")
	private Date tsUpdateTime;

	@Column(name = "v_app_description")
	private String vAppDescription;

	public String getVAppDescription() {
		return vAppDescription;
	}

	public void setVAppDescription(String vAppDescription) {
		this.vAppDescription = vAppDescription;
	}

	public String getVDomainName() {
		return vDomainName;
	}

	public void setVDomainName(String vDomainName) {
		this.vDomainName = vDomainName;
	}

	public Date getTsCreateTime() {
		return tsCreateTime;
	}

	public void setTsCreateTime(Date tsCreateTime) {
		this.tsCreateTime = tsCreateTime;
	}

	public Date getTsUpdateTime() {
		return tsUpdateTime;
	}

	public void setTsUpdateTime(Date tsUpdateTime) {
		this.tsUpdateTime = tsUpdateTime;
	}

	/**
	 * 返回: vAppCode
	 **/
	public String getVAppCode() {
		return vAppCode;
	}

	/**
	 * 设置: vAppCode
	 **/
	public void setVAppCode(String vAppCode) {
		this.vAppCode = vAppCode;
	}

	/**
	 * 返回: vAppName
	 **/
	public String getVAppName() {
		return vAppName;
	}

	/**
	 * 设置: vAppName
	 **/
	public void setVAppName(String vAppName) {
		this.vAppName = vAppName;
	}

}
