package Corejavaprogams;

import java.util.HashMap;

public class OccuranceString {

	public static void main(String[] args) {

		String[] str = { "seshu", "babu", "karanam" };
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String st : str) {
			if (map.containsKey(st)) {
				map.put(st, map.get(st) + 1);

			} else {
				map.put(st, 1);
			}
		}
		System.out.println("Occurance of String "+map);

	}

}
