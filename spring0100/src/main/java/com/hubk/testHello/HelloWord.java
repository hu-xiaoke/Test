package com.hubk.testHello;

public class HelloWord {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHelloWord(){
		System.out.println("Spring:"+name);
	}
}
