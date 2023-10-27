package corejavaprogamswithoutbulidmethods;

import java.util.*;

class welcome {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('a');
		list.add('q');
		HashSet<Character> set = new HashSet<Character>();
		for (Character li : list) {
          set.add(li);
		}
		System.out.println(set);
	}
}
