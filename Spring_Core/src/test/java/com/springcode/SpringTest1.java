package com.springcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringTest1 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new
                ClassPathXmlApplicationContext( "springcore1.xml" );
		Customer c=(Customer)ctx.getBean("Customer");
		c.CustomerInfo();
	}

}
