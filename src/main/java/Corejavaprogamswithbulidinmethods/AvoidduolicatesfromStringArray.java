package Corejavaprogamswithbulidinmethods;

import java.util.HashSet;

public class AvoidduolicatesfromStringArray {

	public static void main(String[] args) {
		String arr[] = { "seshu", "seshu", "babu","babu" ,"karanam","karanam" };
		HashSet<String> set = new HashSet<String>();
		for (String st : arr) {
			set.add(st);
		}
		for (String str : set) {
			System.out.println(str);

		}

	}

}
