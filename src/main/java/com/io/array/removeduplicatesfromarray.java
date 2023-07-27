package com.io.array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

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
		String str = "karanam seshu babu";
		String str1 = "karanam seshu babu";
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

		int str2[] = { 100, 100, 100, 10 };
		for (int i = 0; i < str2.length; i++) {
			for (int j = i + 1; j < str2.length; j++) {
				if (str2[i] == str2[j]) {
					System.out.println(str2[j]);
				}
			}
		}

		String str3[] = { "seshu", "seshu", "babu" };
		for (int i = 0; i < str3.length; i++) {
			for (int j = i + 1; j < str3.length; j++) {
				if (str3[i] == str3[j]) {
					System.out.println(str3[j]);
				}
			}

		}

	}
}
