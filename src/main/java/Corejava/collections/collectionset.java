package Corejava.collections;

import java.util.Iterator;
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
		Iterator ite = set.iterator();
		String str = "karanam";
		while (ite.hasNext()) {
			ite.next();
			if (set.contains(str)) {
				ite.remove();
			}
		}
	}

}
