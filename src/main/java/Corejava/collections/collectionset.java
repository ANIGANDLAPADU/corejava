package Corejava.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class collectionset {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add("seshu");
		set.add("karanam");
		set.add("babu");
		set.add("seshu");
		set.add("karanam");
		set.add("babu");
		System.out.println(set);
	}

}
