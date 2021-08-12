package com.springcore;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.springcore");
		context.refresh();
		while(true) {
			Main obj = (Main) context.getBean("Main");
			System.out.println("Select option: 1. Add 2: Subtract 3. Multiply 4. Divide");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			System.out.println("Enter two values");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(obj.calculateOp(a, b, option));

		}

		//context.close();
	}
}
