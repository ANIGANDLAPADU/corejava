package Corejavaprogams;

import java.util.Arrays;

public class SecondLargestInArray {
	public static int getLargestNumber(int[] a, int total) {
		Arrays.sort(a);
		return a[total -2];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		System.out.println("Second Largest: " + getLargestNumber(a,4));
	}
}