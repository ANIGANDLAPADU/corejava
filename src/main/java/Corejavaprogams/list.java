package Corejavaprogams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {

	public static void main(String[] args) {
		List list= new ArrayList();
		list.add("seshu");
		list.add("babu");
		list.add("karanam");
		list.add("Hi");
		Collections.sort(list);
       System.out.println(list);
	}

}
