package Corejavaprogamswithbulidinmethods;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1 = sc.next();
		System.out.println("Enter a String :");
		String s2 = sc.next();
		char c1[] = s1.toLowerCase().toCharArray();
		char c2[] = s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("given Strings is Anagram");
		} else {
			System.out.println("Given Strings is not Anagram");
		}
	}

}
