package Corejavaprogamswithbulidinmethods;

import java.util.Arrays;

public class fourthlargest {
	public static int largest(int[] a, int length) {
		Arrays.sort(a);
		return a[length-4];

	}

	public static void main(String[] args) {
		int[] a = { 100, 200, 300, 400,600,500,100,20 ,10};
		int length=a.length;
		System.out.println("Fourth Largest Number is:"+largest(a,length));

	}

}
