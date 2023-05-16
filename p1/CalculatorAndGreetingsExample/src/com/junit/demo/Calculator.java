package com.junit.demo;


public class Calculator {
		  
		 public double multiply(double a, double b) {
		  return a * b;
		 }
		  
		 public double divide(double a, double b) { 
		  if(b == 0) {
		   throw new ArithmeticException();
		  }
		  return a / b;
		 } 
		 
		 public double suma(double a, double b) {
			 return a+b;
		 }
		 public double resta(double a, double b) {
			 if (a <= b) {
				 throw new ArithmeticException();
			 }
			 return a-b;
		 }
		 public int factorial(int n){
			if (n < 0) {
				throw new ArithmeticException();
			}
			int result = 1;
			for (int i = 1; i <= n; i++) {
	            result = result*i;
	            System.out.println(i);
	        }
			return result;
		 }
		}
