package com.io.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeduplicatesfromarray {

	public static void main(String[] args) {
		/*
		 * int str[] = { 100, 100, 100, 10 }; Set<Integer> set = new LinkedHashSet();
		 * for(int Str:str) { set.add(Str); } System.out.println(set);
		 */
		/*
		 * String str[] = { "seshu", "seshu", "seshu", "babu" }; Set<String> set = new
		 * LinkedHashSet(); for (String Str : str) { set.add(Str); }
		 * System.out.println(set);
		 */
		/*
		 * String str = "karanam seshu babu"; String str1 = "karanam seshu babu";
		 */
		/*
		 * StringBuffer sb = new StringBuffer(); Set<Character> set = new
		 * LinkedHashSet(); for (int i = 0; i < str.length(); i++) {
		 * set.add(str.charAt(i)); } for (Character st : set) { sb.append(st);
		 * 
		 * } System.out.println(sb);
		 */
		/*
		 * for (int i = 0; i < str.length(); i++) { char c1 = str.charAt(i); char c2 =
		 * str1.charAt(i); if(c1==c2) { System.out.println("match found"); }else {
		 * System.out.println("match not found"); } }
		 */

		/*
		 * StringBuffer sb = new StringBuffer(); StringBuffer sb1 = new StringBuffer();
		 * StringBuilder sb2 = new StringBuilder(); Set<Character> set = new
		 * LinkedHashSet(); ArrayList<Character> arry = new ArrayList(); for (int i = 0;
		 * i < str.length(); i++) { arry.add(str.charAt(i)); } for (Character ch : arry)
		 * { sb.append(ch); } for (int i = 0; i < str1.length(); i++) {
		 * arry.add(str1.charAt(i));
		 * 
		 * } for (Character ch : arry) { sb1.append(ch); } String str2 =
		 * sb.append(sb1).toString(); for (int i = 0; i < str2.length(); i++) {
		 * set.add(str2.charAt(i));
		 * 
		 * } for (Character se : set) { sb2.append(se); } System.out.println(sb2);
		 */

		/*
		 * int str2[] = { 100, 100, 100, 10 }; for (int i = 0; i < str2.length; i++) {
		 * for (int j = i + 1; j < str2.length; j++) { if (str2[i] == str2[j]) {
		 * System.out.println(str2[j]); } } }
		 * 
		 * String str3[] = { "seshu", "seshu", "babu" }; for (int i = 0; i <
		 * str3.length; i++) { for (int j = i + 1; j < str3.length; j++) { if (str3[i]
		 * == str3[j]) { System.out.println(str3[j]); } }
		 */

		String str = "seshubabu";
		int length = str.length();
		char ch[] = str.toCharArray();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
					break;
				}

			}
		}

		/*
		 * Scanner sc = new Scanner(System.in); int orginal = sc.nextInt();
		 * System.out.println("Enter a Number" + orginal); StringBuilder sb = new
		 * StringBuilder(String.valueOf(orginal)); StringBuilder rever = sb.reverse();
		 * int reverse = Integer.parseInt(rever.toString()); if (orginal == reverse) {
		 * System.out.println("Given number is palindrome"); } else {
		 * System.out.println("Given number is not palindrome"); }
		 */
		/*
		 * String reverse = "";
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in); StringBuilder sb = new StringBuilder();
		 * List<Character> list = new ArrayList(); String origin = sc.next(); String
		 * original = origin; System.out.println("Enter a String"); for (int i = 0; i <
		 * original.length(); i++) { list.add(original.charAt(i)); } for (Character se :
		 * list) { sb.append(se); sb.append(reverse); }
		 * 
		 * if (original.equals(reverse)) {
		 * System.out.println("Given String is palindrome"); } else {
		 * System.out.println("Given String is not palindrome"); }
		 */

	}

}
