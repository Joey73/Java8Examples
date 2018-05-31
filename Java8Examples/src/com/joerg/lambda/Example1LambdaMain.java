package com.joerg.lambda;

public class Example1LambdaMain {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Printing from Runnable")).start();
	}
}
