package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.aop.service.Operation;

//Spring AOP + AspectJ

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Operation e = (Operation) context.getBean("opBean");

		System.out.println("calling msg...");
		e.msg();

		System.out.println("calling m...");
		e.m();

		System.out.println("calling k...");
		e.k();

	}

}
