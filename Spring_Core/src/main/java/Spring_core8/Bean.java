package com.springcore8;


import org.springframework.beans.factory.DisposableBean;

import org.springframework.beans.factory.InitializingBean;


public class Bean implements InitializingBean,DisposableBean {

//@Override

public void afterPropertiesSet() throws Exception
{
    System.out.println(
        "Bean has been "
        + "instantiated and I'm the "
        + "init() method");
}

//@Override

public void destroy() throws Exception
{
    System.out.println(
        "Conatiner has been closed "
        + "and I'm the destroy() method");
}
}
