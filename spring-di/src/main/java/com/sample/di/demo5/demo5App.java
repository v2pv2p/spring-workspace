package com.sample.di.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo5App {
	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo5/demo5.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		UserService s = ctx.getBean("userService", UserService.class);
		String name = "병민";
		String id = "ahn";
		String password = "zxcv1234";
		
		s.addNewUser(name, id, password);
		
	}
}
