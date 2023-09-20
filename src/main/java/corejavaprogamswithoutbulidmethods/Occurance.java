package corejavaprogamswithoutbulidmethods;

import java.util.Arrays;

public class Occurance {

	public static void main(String[] args) {
		String str = "seshu";
		String str1 = "babu";
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if (Arrays.equals(ch, ch1)) {
           System.out.println("given string anagram");
		}else {
			System.out.println();
		}

	}
}