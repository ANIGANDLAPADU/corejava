package java8;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIFilter {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("seshu babu karanam");
		list.stream().filter(li -> li.startsWith("se")).forEach(System.out::println);
		list.stream().filter(li -> li.endsWith("am")).forEach(System.out::println);
	}
}