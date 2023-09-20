package Corejavaprogamswithbulidinmethods;

import java.util.HashMap;

public class OccuranceofCharacter {

	public static void main(String[] args) {
		/*
		 * String s = "seshu babu"; int se = s.length(); int ses = s.replace("a",
		 * "").length(); int total = se - ses; System.out.println(total);
		 */
		String str = "seshu";
		char[] str2 = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : str2) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
