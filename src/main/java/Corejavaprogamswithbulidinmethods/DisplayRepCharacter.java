package Corejavaprogamswithbulidinmethods;

import java.util.Scanner;

public class DisplayRepCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a String :");
		String str = sc.next();
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println(+ch[i]);
				}
			}

		}

	}
}
