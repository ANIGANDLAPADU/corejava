package Corejavaprogams;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int user_str = 101;
		StringBuffer sb = new StringBuffer(String.valueOf(user_str));
		if (Integer.parseInt(sb.reverse().toString()) == user_str) {
			System.out.println("Given number is PalindromeNumber");
		} else {
            System.out.println("Given number is not PalindromeNumber");
		}

	}

}
