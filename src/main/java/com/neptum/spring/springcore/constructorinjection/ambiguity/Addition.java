package com.neptum.spring.springcore.constructorinjection.ambiguity;

class Addition 
{
	Addition(int a, int b){
		System.out.println("Inside the constructor INT");
	}
	
	Addition(double a, double b){
		System.out.println("Inside the constructor DOUBLE");
	}
	
	Addition(String a, String b){
		System.out.println("Inside the constructor STRING");
	}
}
