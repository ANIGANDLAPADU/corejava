package Corejavaprogamswithbulidinmethods;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number  :");
		int i = sc.nextInt();
		int temp=i;
		int sum = 0;
		while (i > 0) {
			int j = i % 10;
			i = i / 10;
			sum = sum + j * j * j;

		}
		if (temp == sum) {
			System.out.println("Given number is Armstrongnumber :");
		} else {
			System.out.println("given number is not Armstrongnumber :");
		}

	}

}
