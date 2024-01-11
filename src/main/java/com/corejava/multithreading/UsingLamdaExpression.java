package com.corejava.multithreading;

public class UsingLamdaExpression {

	public static void main(String[] args) {
		Runnable runnable = () -> {
         System.out.println("using lamda expression");
		};
		runnable.run();

	}

}
