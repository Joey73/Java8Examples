package com.joerg.lambda;

public class Example3Main {

	public static void main(String[] args) {
		String testString1 = "test1";
		String testString2 = "test2";
		
		String sillyString = doStringStuff(new Example3UpperConcatInterface() {
			@Override
			public String upperAndConcat(String s1, String s2) {
				return s1.toUpperCase() + s2.toUpperCase();
			}
		}, testString1, testString2);
		
		System.out.println(sillyString);
	}
	
	public final static String doStringStuff(Example3UpperConcatInterface uc, String s1, String s2) {
		return uc.upperAndConcat(s1, s2);
	}
}
