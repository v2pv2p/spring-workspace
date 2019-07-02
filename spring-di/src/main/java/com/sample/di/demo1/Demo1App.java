package com.sample.di.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1App {
	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo1/demo1.xml";
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		Sample1 sample1 = (Sample1) ctx.getBean("s1");
		sample2 sample2 = ctx.getBean("s2", sample2.class);
		
		String msg3 = sample2.greeting("홍길동");
		
		String msg1 = sample1.hello();
		String msg2 = sample1.bye();
		
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		
		
	}
}
