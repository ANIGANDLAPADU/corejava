package practice;

import java.util.Arrays;
import java.util.Scanner;

public class sumofnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a String :");
		String str = sc.next();
		System.out.println("please enter a String :");
		String str1 = sc.next();
		char[] ch = str.toLowerCase().toCharArray();
		char[] ch1 = str1.toLowerCase().toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if (Arrays.equals(ch, ch1)) {
			System.out.println("given String is Anargaram");
		} else {
			System.out.println("given String is not Anargaram");
		}

	}
}