package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Main")
public class Main {

	@Autowired
	@Qualifier("Multiply")
	IOPInterface iopInterface;

	public Main() {

	}

	public int calculateOp(int a, int b) {
		return iopInterface.Operationab(a, b);
	}

}
