package Corejavaprogamswithbulidinmethods;

import java.util.Scanner;

public class CountSumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number:");
		int i = sc.nextInt();
		int sum = 0;
		while (i > 0) {
			int j = i%10;
			sum = sum +j;
			i = i / 10;
		}

		System.out.println("sum of Digits are :" + sum);

	}

}
