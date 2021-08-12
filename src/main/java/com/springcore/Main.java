package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Main")
public class Main {

	@Autowired
	@Qualifier("Multiply")
	IOPInterface iopInterface;
	
	
	@Autowired
	@Qualifier("Add")
	IOPInterface iopInterface1;
	
	
	@Autowired
	@Qualifier("Subtract")
	IOPInterface iopInterface2;
	
	
	@Autowired
	@Qualifier("Divide")
	IOPInterface iopInterface3;

	public Main() {

	}

	public int calculateOp(int a, int b, int qualifier) {
		
		switch(qualifier) {
		case 1:
			return iopInterface1.Operationab(a, b);
			
		case 2:
			 return iopInterface2.Operationab(a, b);	
		case 3:
			return iopInterface.Operationab(a, b);
		case 4:
			return iopInterface3.Operationab(a, b);
		default:
			return 0;
		}
	
		
	}

}
