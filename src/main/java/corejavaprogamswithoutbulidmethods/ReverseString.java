package corejavaprogamswithoutbulidmethods;

import java.util.Scanner;

public class ReverseString {
	public static void reverse(char[] ch, int length) {
		if (length > 0) {
			System.out.print(ch[length - 1]);
			length--;
			reverse(ch, length);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int length = ch.length;
		reverse(ch, length);

	}

}
