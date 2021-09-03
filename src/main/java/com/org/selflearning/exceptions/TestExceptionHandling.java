package com.org.selflearning.exceptions;

import com.org.selflearning.entity.Employee;

public class TestExceptionHandling {
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Start of test");
		String str = new String("");
		Employee emp = new Employee(); 
		
		try {
//			TestExceptionTypes.testArithmatic();
//			System.out.println("1. After method call.");
			//ExceptionTypes.testArithmatic();
			ExceptionTypes.testMyCustomException();
			System.out.println("2. After method call.");
			//throw new ArithmeticException();
			
		} catch (ArithmeticException ae) {
			System.out.println("Arithmatic exception catched. Please try again later.");
		} catch (NumberFormatException ne) {
			System.out.println("Number Format exception catched. Please try again later.");
		} catch (MyCustomException me) {
			System.out.println("My Own Custom exception catched. Please try again later.");
		} catch (Exception e) {
			System.out.println("Generic/Common/Parent exception catched. Please try again later.");
		} finally {
			// To close open connections used in this method.
			// To close used resource in this method.
			emp = null; str = null;
			System.out.println("Sending email....");
		}
		
		System.out.println("End of test");
		
		
		
	}

}
	