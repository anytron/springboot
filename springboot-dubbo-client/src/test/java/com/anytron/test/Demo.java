package com.anytron.test;

import com.github.jsonzou.jmockdata.JMockData;

public class Demo {
	public static void main(String[] args) {
		TCourier mock = JMockData.mockSimpleType(TCourier.class);
		System.out.println(mock.toString());
	}
}