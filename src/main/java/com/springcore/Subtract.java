package com.springcore;

import org.springframework.stereotype.Component;

@Component("Subtract")
public class Subtract implements IOPInterface {

	public int Operationab(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
