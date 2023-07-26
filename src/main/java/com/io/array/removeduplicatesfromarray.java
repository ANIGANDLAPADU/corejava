package com.io.array;

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
		StringBuffer sb = new StringBuffer();
		Set<Character> set = new LinkedHashSet();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character st : set) {
			sb.append(st);

		}
		System.out.println(sb);

	}

}
