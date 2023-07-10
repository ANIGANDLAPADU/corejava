package com.io.array;

public class twodimArray {
	public static void main(String[] args) {
		int a[][] = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		for (int x[] : a) {

			for (int b : x) {
				System.out.print(b + "    ");
			}
			System.out.println();
		}

	}
}
