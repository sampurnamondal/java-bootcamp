package com.sampurna.javabootcamp;



public class Test {

	public static void main(String[] args) {
		int a = 1;
		System.out.println("In main" + a);
		testPrim(a);
		System.out.println("In main after testPrim"  + a);
	}
	
	static void testPrim(int a) {
		a = a+9;
		System.out.println("In method" + a);
	}

}
