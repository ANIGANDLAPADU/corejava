package Corejavaprogams;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String");
		String str = sc.next();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		String str2 = sb.reverse().toString();
		if (str2.equals(str)) {
			System.out.println("Given String is palindrome");

		} else {
			System.out.println("given String is not palindrome");
		}
	}

}
