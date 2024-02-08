package Corejavaprogamswithbulidinmethods;

public class CountUpperCaseCharacter {

	public static void main(String[] args) {
		String str = "SeshuBabU";
		int UpperCase = 0;
		int LowerCase = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				UpperCase++;
			} else {
				LowerCase++;
			}
		}
		System.out.println(UpperCase);
		System.out.println(LowerCase);
	}

}
