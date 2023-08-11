package Corejavaprogamswithbulidinmethods;

import java.util.LinkedHashSet;
import java.util.Set;

public class AvoidduolicatesfromStringArray {

	public static void main(String[] args) {
		String arr[] = { "seshu", "seshu", "babu","babu" ,"karanam","karanam" };
		Set<String> set = new LinkedHashSet<String>();
		for (String st : arr) {
			set.add(st);
		}
		for (String str : set) {
			System.out.println(str);

		}

	}

}
