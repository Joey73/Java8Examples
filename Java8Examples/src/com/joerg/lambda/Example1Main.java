package com.joerg.lambda;

public class Example1Main {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printing from the Runnable");
			}
		}).start();
	}
}
