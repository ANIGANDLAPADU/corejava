package com.corejava.multithreading;

public class UsingAnonymousClass {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			public void run() {
				System.out.println("using anonymous class");
			}

		};

	}

}
