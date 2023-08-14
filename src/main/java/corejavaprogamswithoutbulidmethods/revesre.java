package corejavaprogamswithoutbulidmethods;

import java.util.*;

public class revesre {
	public static void strverse(char[] ch,int length) {
	System.out.println(ch[length-1]);
	length--;
	strverse(ch, length);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String  :");
		String str = sc.next();
		char[] ch = str.toCharArray();
		int length=ch.length;
		strverse(ch, length);

	}

}
