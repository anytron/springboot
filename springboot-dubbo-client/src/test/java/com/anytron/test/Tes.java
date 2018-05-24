package com.anytron.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.anytron.application.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Tes {
	@Test
	public void contextLoads() {
		System.out.println("hello world");
	}
}
