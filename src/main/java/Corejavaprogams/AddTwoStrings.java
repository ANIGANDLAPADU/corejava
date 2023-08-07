package Corejavaprogams;

import java.util.LinkedHashSet;
import java.util.Set;

public class AddTwoStrings {

	public static void main(String[] args) {
		String s1 = "seshubabu";
		String s2 = "akhilbabu";
		int count = 0;
		int count2 = 0;
		StringBuffer sb = new StringBuffer();
		StringBuilder stringbuilder = new StringBuilder();
		sb.append(s1);
		sb.append(s2);
		String str = sb.toString();
		System.out.println("After Adding Two Strings:" + str);
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
			count++;
		}
		System.out.println("Length of a String before removing Duplicates :" + count);
		for (Character Str : set) {
			stringbuilder.append(Str);
			count2++;
		}

		System.out.println("After Reversing the String :" + stringbuilder.reverse());
		System.out.println("Lenght of a String After removing Duplicates :" + count2);
	}

}
