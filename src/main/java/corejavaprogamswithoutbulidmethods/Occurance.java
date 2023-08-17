package corejavaprogamswithoutbulidmethods;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
	public static void main(String[] args) {
		String str = "seshu babu karanam";
		char[] ch = str.toCharArray();
		int length = ch.length;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (!ch.equals(" ")) {

				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		}
		System.out.println(map);

	}
}