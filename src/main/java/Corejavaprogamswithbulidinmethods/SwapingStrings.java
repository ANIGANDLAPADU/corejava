package Corejavaprogamswithbulidinmethods;

public class SwapingStrings {

	public static void main(String[] args) {
		String str = "seshu";
		String str1 = "babu";
		System.out.println("before swaping :");
		System.out.println("value of str :" + str);
		System.out.println("value of str1 :" + str1);
		str = str + str1;
		System.out.println("after adding two strings :" + str);
		str1 = str.substring(0, str.length() - str1.length());
		str = str.substring(str1.length());
		System.out.println("after swaping two strings :");
		System.out.println("value of str :" + str);
		System.out.println("value of str1  :" + str1);

	}

}
