package com.joerg.lambda;

public class Example4AnotherClass {
	public String doSomething() {
		System.out.println("The Example4AnotherClass class's name is: " + getClass().getSimpleName());
		return Example4Main.doStringStuff(new Example4UpperConcatInterface() {
			@Override
			public String upperAndConcat(String s1, String s2) {
				// An anonymous class does not have a name
				System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
				return s1.toUpperCase() + s2.toUpperCase();
			}
		}, "test1", "test2");
	}
}
