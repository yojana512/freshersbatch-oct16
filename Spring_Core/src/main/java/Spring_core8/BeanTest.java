package com.springcore8;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore8.BeanTest;

//Driver class
public class BeanTest {

public static void main(String[] args) throws Exception
{

    
    ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("bean.xml");
  cap.close();
}
}
