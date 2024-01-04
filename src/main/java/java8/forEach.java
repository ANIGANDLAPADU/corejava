package java8;

import java.util.Arrays;
import java.util.List;

public class forEach {

	public static void main(String[] args) {
		// foreach method is only applyable for the arrays & all type of collection
		int[] a = { 1, 4, 7 };
		for (int c : a) {
			System.out.print(c);
		}
		List<Integer> list = Arrays.asList(2, 4, 5, 1);
		for(int li:list) {
			System.out.print(li);
		}
	}

}
