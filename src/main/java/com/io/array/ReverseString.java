package com.io.array;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
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

	}

}
