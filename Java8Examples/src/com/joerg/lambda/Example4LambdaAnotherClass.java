package com.joerg.lambda;

public class Example4LambdaAnotherClass {
	public String doSomething() {
		System.out.println("The Example4LambdaAnotherClass class's name is: " + getClass().getSimpleName());
		Example4UpperConcatInterface uc = (s1, s2) -> {
			System.out.println("The lambda expression's class is: " + getClass().getSimpleName());
			String result = s1.toUpperCase() + s2.toUpperCase();
			return result;
		};
		return Example4Main.doStringStuff(uc, "test1", "test2"); 
	}
}
