package java8;

import java.util.function.Predicate;

public class predicateinterface {

	public static void main(String[] args) {

		Predicate<Integer> pre = k -> (k > 5);
		System.out.println(pre.test(10));

		Predicate<Integer> pre1 = k -> (k > 5);
		System.out.println(pre1.test(1));

		// chaining two predicates
		System.out.println(pre.and(pre1));
	}

}
