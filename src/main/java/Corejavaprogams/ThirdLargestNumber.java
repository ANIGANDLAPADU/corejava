package Corejavaprogams;

import java.util.Arrays;

public class ThirdLargestNumber {
	public static int Third(int[] a, int total) {
		Arrays.sort(a);
		return a[total - 3];

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 3, 543, 54, 364 };
		System.out.println(Third(a, 543));

	}

}
