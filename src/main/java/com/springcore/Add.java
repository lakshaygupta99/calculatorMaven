package com.springcore;

import org.springframework.stereotype.Component;

@Component("Add")
public class Add implements IOPInterface{

	public int Operationab(int a, int b) {
		
		return a+b;
	}

}
