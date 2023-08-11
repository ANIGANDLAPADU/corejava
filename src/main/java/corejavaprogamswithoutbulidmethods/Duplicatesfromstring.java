package corejavaprogamswithoutbulidmethods;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicatesfromstring {

	public static void main(String[] args) {
	   String str = "seshu";
	   StringBuffer sb = new StringBuffer();
	   Set<Character> set = new LinkedHashSet<Character>();
	   for(int i=0;i<str.length();i++) {
		   set.add(str.charAt(i));
		   
	   }for(Character CH:set) {
		   sb.append(CH);
	   }
	   System.out.println("after removing duplicates from a String"+sb);
	   

	}

}
