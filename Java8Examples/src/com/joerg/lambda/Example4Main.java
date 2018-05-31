package com.joerg.lambda;

public class Example4Main {

	public static void main(String[] args) {
		// Using anonymous class
		Example4AnotherClass anotherClass = new Example4AnotherClass();
		String sillyString = anotherClass.doSomething();
		System.out.println(sillyString);

		System.out.println();

		// Using Lambda
		Example4LambdaAnotherClass anotherClassLambda = new Example4LambdaAnotherClass();
		sillyString = anotherClassLambda.doSomething();
		System.out.println(sillyString);
	}
	
	public final static String doStringStuff(Example4UpperConcatInterface uc, String s1, String s2) {
		return uc.upperAndConcat(s1, s2);
	}
}
