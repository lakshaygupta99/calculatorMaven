package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.springcore");
		context.refresh();
		Main obj = (Main) context.getBean("Main");
		System.out.println(obj.calculateOp(21, 2));

		context.close();
	}
}
