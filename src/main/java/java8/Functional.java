package java8;

import java.util.function.Function;

public class Functional {

	public static void main(String[] args) {

		Function<Integer, Integer> fu = n -> n * n;
		System.out.println(fu.apply(4));

		Function<String, Integer> fu1 = n -> n.length();
		System.out.println(fu1.apply("seshubabu"));

		Function<String, String> fu2 = n -> new StringBuffer("seshubabu").reverse().toString();
		System.out.println(fu2.apply("seshubabu"));

		// function chaining
		Function<Integer, Integer> fn = f -> f * f;
		fn.apply(2);
		Function<Integer, Integer> fn1 = f -> f * f;
		fn.apply(2);
		System.out.println(fn.andThen(fn1).apply(2));
		System.out.println(fn.compose(fn1).apply(4));

	}

}
