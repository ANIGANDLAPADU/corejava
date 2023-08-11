package Corejavaprogamswithbulidinmethods;

import java.util.Arrays;

public class fourthlargest {
	public static int largest(int[] a, int total) {
		Arrays.sort(a);
		return a[total-1];

	}

	public static void main(String[] args) {
		int[] a = { 100, 200, 300, 400,600,500,100,20 ,10};
		System.out.println("Fourth Largest Number is:"+largest(a,9));

	}

}
