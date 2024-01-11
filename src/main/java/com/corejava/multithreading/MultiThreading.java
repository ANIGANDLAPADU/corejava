package com.corejava.multithreading;

public class MultiThreading extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread();
		t1.start();
		System.out.println("hello ThreadOne");
		Thread t2 = new Thread();
		t2.start();
		System.out.println("hello ThreadIwo");
		t2.getName();
	}

}
