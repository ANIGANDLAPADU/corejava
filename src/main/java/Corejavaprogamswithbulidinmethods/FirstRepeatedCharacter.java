package Corejavaprogamswithbulidinmethods;

import java.util.HashSet;

public class FirstRepeatedCharacter {
	public static Character RepeatedCharacter(String str) {

		HashSet<Character> hashSet = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hashSet.contains(c)) {
				return c;
			}else {
				hashSet.add(c);
			}
		}
		return null;

	}

	public static void main(String[] args) {
		String str = "seshubabukaranam";
		Character results = RepeatedCharacter(str);
		if (results != null) {
			System.out.println("first repeated Character in given string :" + results);
		} else {
			System.out.println("first repeated character not found ");
		}

	}

}
