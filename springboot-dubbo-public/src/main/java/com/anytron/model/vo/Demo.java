package com.anytron.model.vo;

import java.io.Serializable;

public class Demo implements Serializable{
	private static final long serialVersionUID = 7137367660318308996L;
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Demo [name=" + name + ", age=" + age + "]";
	}
	
}
