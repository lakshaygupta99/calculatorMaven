package com.springcore;

import org.springframework.stereotype.Component;

@Component("Divide")
public class Divide implements IOPInterface {

	public int Operationab(int a, int b) {
		if(b!=0) {
			return a/b;
		}
		return 0;
	}

}
