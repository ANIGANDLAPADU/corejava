package Corejavaprogamswithbulidinmethods;

public class ReverseEachWord {

	public static void main(String[] args) {
		// first approch reverese each word in given string
		String str = "Hello Seshu Babu";
		String[] ch = str.split(" ");
		String ReverseString = "";
		for (String c : ch) {
			String ReverseWord = "";
			for (int i = c.length() - 1; i >= 0; i--) {
				ReverseWord = ReverseWord + c.charAt(i);
			}
			ReverseString = ReverseString + ReverseWord + " ";
		}

		System.out.println(ReverseString);
		// Second approch reverese each word in given string using bulid-in methods
		String str1 = "Hello Seshu Babu";
		String[] ch1 = str.split(" ");
		String ReverseString1 = "";
		for (String c : ch) {
			StringBuffer sb = new StringBuffer(c);
			sb.reverse();
			ReverseString1 = ReverseString1 + sb.toString() + " ";
		}

		System.out.println(ReverseString);

	}

}
