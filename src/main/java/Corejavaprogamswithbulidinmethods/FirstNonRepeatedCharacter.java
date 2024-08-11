package Corejavaprogamswithbulidinmethods;

import java.util.HashMap;

public class FirstNonRepeatedCharacter {
	public static Character firstNonRepeated(String str) {

		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		for (char ch : str.toCharArray()) {

			hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);

		}
		for (char ch : str.toCharArray()) {
			if (hashMap.get(ch) == 1) {
				return ch;
			}
		}
		return null;
	}

	public static void main(String[] args) {

		String str = "seshubabukaranam";
		System.out.println("first Non repeated character is :" + firstNonRepeated(str));
	}

}
