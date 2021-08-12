package com.springcore;

import org.springframework.stereotype.Component;

@Component("Multiply")
public class Multiply implements IOPInterface{

	public int Operationab(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
