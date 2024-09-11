package Corejavaprogamswithbulidinmethods;

import java.util.HashMap;
import java.util.Scanner;

public class DisplayRepCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a String :");
		String str = sc.next();
		int length = str.length();
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
