package Corejavaprogams;

import java.util.LinkedHashSet;
import java.util.Set;

public class AddTwoStrings {

	public static void main(String[] args) {
		String s1 = "seshubabu";
		String s2 = "akhilbabu";
		int count=0;
		StringBuffer sb = new StringBuffer();
		StringBuilder stringbuilder = new StringBuilder();
		sb.append(s1);
		sb.append(s2);
		String str = sb.toString();
		System.out.println(str);
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
			count++;
		}
		System.out.println(count);
		for (Character Str : set) {
			stringbuilder.append(Str);
		}
		System.out.println(stringbuilder.reverse());

	}

}
