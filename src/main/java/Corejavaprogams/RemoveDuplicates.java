package Corejavaprogams;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "seshu babu";
		StringBuffer sb = new StringBuffer();
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character Str2 : set) {
			sb.append(Str2);
		}
		System.out.println(sb);
	}

}
