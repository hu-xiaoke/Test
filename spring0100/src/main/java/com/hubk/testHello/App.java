package com.hubk.testHello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWord obj = (HelloWord) context.getBean("helloBean");
		obj.sayHelloWord();
	}

}
