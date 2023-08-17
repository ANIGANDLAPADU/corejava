package corejavaprogamswithoutbulidmethods;

import java.util.Scanner;

public class Occurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number :");
		int i = sc.nextInt();
		while (i > 0) {
			int j = i % 10;
			System.out.print(j);
			i = i / 10;

		}
	}
}