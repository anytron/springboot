package com.anytron.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.anytron.application.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Tes {
	
	Logger log = Logger.getLogger(Tes.class);
	@Test
	public void contextLoads() {
		log.info("riz.............");
		System.out.println("hello world");
	}
}
