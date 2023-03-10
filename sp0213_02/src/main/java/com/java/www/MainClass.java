package com.java.www;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		//HelloWorldEn hello1 = new HelloWorldEn(); 
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:beans.xml"); //beans.xml가서 객체를 하나 뽑아오겠다 
		Hello hello1 = ctx.getBean("hello1",Hello.class);
		
		callMethod(hello1);
		
		
	}
	
	
	public static void callMethod(Hello helloVo) {
		helloVo.sayHello();
	}
}
