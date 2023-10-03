package corejavaprogamswithoutbulidmethods;

import java.util.*;

public class Occurance {
	public static void main(String[] args) {
		String str = "seshubabu";
		StringBuffer stringbuffer = new StringBuffer();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (char se : set) {
			stringbuffer.append(se);
		}
		System.out.println("After removing Duplicates from a String :"+stringbuffer);
	}
}