package corejavaprogamswithoutbulidmethods;

import java.util.Arrays;

public class revesre {
	public static int third(int[] a, int length) {
		Arrays.sort(a);
		return a[length - 2];

	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		System.out.println(third(a, 4));
	}

}