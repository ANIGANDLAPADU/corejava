package corejavaprogamswithoutbulidmethods;

import java.util.*;

public class Occurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String :");
		String str = sc.nextLine();
		System.out.println("Enter A String :");
		String str1 = sc.nextLine();
		str = str + str1;
		System.out.println("after adding two strings :");
		str1 = str.substring(0, str.length() - str1.length());
		str = str.substring(str1.length());
		System.out.println("After swaping  :"+str);
		System.out.println("After swaping  :"+str1);

	}
}