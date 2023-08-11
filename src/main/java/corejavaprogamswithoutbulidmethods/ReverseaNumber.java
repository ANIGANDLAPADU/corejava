package corejavaprogamswithoutbulidmethods;

import java.util.*;

public class ReverseaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 12345;
		int sum=0;
		while (i != 0) {
			int j = i % 10;
			System.out.print(j);
			i = i / 10;
		}
	}

}
