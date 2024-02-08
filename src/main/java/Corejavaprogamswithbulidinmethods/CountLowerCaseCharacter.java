package Corejavaprogamswithbulidinmethods;

public class CountLowerCaseCharacter {

	public static void main(String[] args) {
		String str = "SeshuBabU";
		int UpperCase = 0;
		int LowerCase = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				LowerCase++;
			} else {
				UpperCase++;
			}
		}
		System.out.println(UpperCase);
		System.out.println(LowerCase);
	

	}

}
