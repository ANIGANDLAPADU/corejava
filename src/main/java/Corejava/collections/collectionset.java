package Corejava.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class collectionset {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("seshu");
		set.add("karanam");
		set.add("babu");
		set.add("seshu");
		set.add("karanam");
		set.add("babu");
		Iterator<String> ite = set.iterator();
		String str = "karanam";
		while (ite.hasNext()) {
			System.out.println(ite.next());
			if (set.contains(str)) {
				ite.remove();
			}
		}
		
	}

}
