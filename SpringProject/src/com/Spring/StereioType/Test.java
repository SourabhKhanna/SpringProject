package com.Spring.StereioType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/StereioType/sterio.xml");
	Sterio_Address address=context.getBean(Sterio_Address.class);
	System.out.println(address);
}
}
