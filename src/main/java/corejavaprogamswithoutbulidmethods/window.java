package corejavaprogamswithoutbulidmethods;

import java.util.HashMap;

public class window {
	public static Character firstNonRepeated(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for(char c:str.toCharArray()) {
			hashMap.put(c,hashMap.getOrDefault(c,0)+1);
		}
		for(char c:str.toCharArray()) {
			if(hashMap.get(c)==1) {
				return c;
			}
		}
		return null;
	}
	public static void main(String args[]) {
		String str = "SeshuBabu";
		System.out.println(firstNonRepeated(str));
        
	}
}