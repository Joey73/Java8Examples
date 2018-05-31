package com.joerg.lambda;

public class Example3MainLambda {

	public static void main(String[] args) {
		String testString1 = "test1";
		String testString2 = "test2";
		
//		Example3UpperConcatInterface uc = (s1, s2) -> {
//			String result = s1.toUpperCase() + s2.toUpperCase();
//			return result;
//		};
//		Shorter:
		Example3UpperConcatInterface uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
		
		String sillyString = doStringStuff(uc, testString1, testString2);
		System.out.println(sillyString);
	}
	
	public final static String doStringStuff(Example3UpperConcatInterface uc, String s1, String s2) {
		return uc.upperAndConcat(s1, s2);
	}
}
