package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinandMax {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 3, 2, 10);
		// find max value in given array
		Optional<Integer> li = list.stream().max((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println("maxmum value is :" + li.get());
		// find min value in given array
		Optional<Integer> li1 = list.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println("maxmum value is :" + li1.get());
		list.stream().sorted().forEach(System.out::println);

	}
}
