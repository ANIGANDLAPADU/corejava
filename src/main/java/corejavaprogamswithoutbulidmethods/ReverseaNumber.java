package corejavaprogamswithoutbulidmethods;

import java.util.*;

public class ReverseaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number  :");
		int i = sc.nextInt();
		while (i > 0) {
			int j = i % 10;
			System.out.print(j);
			i = i / 10;
		}
	}

}
