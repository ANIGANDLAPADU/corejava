package Corejavaprogams;

import java.util.LinkedHashSet;
import java.util.Set;

public class AvoidDuplicatesFromIntArray {

	public static void main(String[] args) {
		int a[] = { 100, 200, 300,200,100,300 };
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int b:a) {
			set.add(b);
		}
		System.out.println(set);
	}

}
