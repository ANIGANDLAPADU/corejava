package Corejavaprogamswithbulidinmethods;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingtheIndexofElement {
	public static void main(String[] args) {

		int[] a = { 1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the element :");
		int result = scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (result == a[i]) {
				arrayList.add(i);
			}
		}
		if (arrayList.isEmpty()) {
			System.out.println("given number  is not found");
		} else {
			System.out.println("your" + result + " at the" + arrayList + "positon");
		}
		scanner.close();

	}
}
