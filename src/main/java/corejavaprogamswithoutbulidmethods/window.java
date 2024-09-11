package corejavaprogamswithoutbulidmethods;

import java.util.HashMap;

public class window {
	public static void main(String args[]) {
		String str = "seshubabukaranam";
		char[] str1 = str.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (char s : str1) {
			if (hashMap.containsKey(s)) {
				hashMap.put(s, hashMap.get(s) + 1);
			} else {
				hashMap.put(s, 1);
			}
		}
	   for(char s:hashMap.keySet()) {
		   if(hashMap.get(s)>1) {
			   System.out.println(s);
		   }
	   }

	}
}