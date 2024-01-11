package com.corejava.multithreading;

public class MultiThreadingOne implements Runnable {

	public static void main(String[] args) {
		MultiThreadingOne multiThreadingOne = new MultiThreadingOne();
		Thread thread = new Thread(multiThreadingOne);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("hello");

	}
}
