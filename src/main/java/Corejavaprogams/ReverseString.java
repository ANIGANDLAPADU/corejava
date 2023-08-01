package Corejavaprogams;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// first approch

		String str = "Seshu babu";
		StringBuffer sb = new StringBuffer();
		List<Character> list = new ArrayList();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			list.add(ch);
		}
		for (Character str2 : list) {
			sb.append(str2);
		}
		System.out.println(sb.reverse());

		// second approch
		String str4 = "seshu babu";
		StringBuffer sb1 = new StringBuffer();
		String str5 = sb1.append(str4).reverse().toString();
		System.out.println("before reverse a string " + str4);
		System.out.println("after reverse a String " + str5);
	}

}