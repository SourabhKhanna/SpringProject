package com.capg.autowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/capg/autowiring/Autowiring.xml");
	
	Employee employee=context.getBean(Employee.class);
	System.out.println(employee.display());
}
}
