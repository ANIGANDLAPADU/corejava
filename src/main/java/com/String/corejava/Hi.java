package com.String.corejava;

import java.io.FileNotFoundException;

class Bye {
	public void seshu() throws FileNotFoundException {

	}
}

public class Hi extends Bye {

	public void seshu() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Hi hi = new Hi();
		try {
			hi.seshu();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
