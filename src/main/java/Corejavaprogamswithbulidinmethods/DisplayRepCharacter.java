package Corejavaprogamswithbulidinmethods;

import java.util.Scanner;

public class DisplayRepCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a String :");
		String str = sc.next();
		int length = str.length();
		char[] ch = str.toCharArray();
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(+ch[j]);
					break;
				}
			}

		}

	}
}
