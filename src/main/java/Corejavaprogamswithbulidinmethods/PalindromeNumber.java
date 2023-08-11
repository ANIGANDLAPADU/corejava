package Corejavaprogamswithbulidinmethods;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter a Number");
		int user_str = sc.nextInt();
		StringBuffer sb = new StringBuffer(String.valueOf(user_str));
		if (Integer.parseInt(sb.reverse().toString()) == user_str) {
			System.out.println("Given number is PalindromeNumber");
		} else {
            System.out.println("Given number is not PalindromeNumber");
		}

	}

}
