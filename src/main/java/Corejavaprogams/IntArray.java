package Corejavaprogams;

import java.util.Arrays;

public class IntArray {
	public static int getnumber(int[] a, int total) {
		Arrays.sort(a);
		return a[total -2];

	}

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		System.out.println("largest number" + getnumber(a, 4));
	}

}
