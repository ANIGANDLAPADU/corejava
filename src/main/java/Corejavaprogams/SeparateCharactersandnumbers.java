package Corejavaprogams;

public class SeparateCharactersandnumbers {

	public static void main(String[] args) {
		String str = "121@#$!SESHU";
		StringBuffer chars = new StringBuffer();
		StringBuffer numerics = new StringBuffer();
		StringBuffer splchars = new StringBuffer();
		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				chars.append(ch);
			} else if (Character.isDigit(ch)) {
				numerics.append(ch);
			} else {
				splchars.append(ch);
			}
		}
		System.out.println("chars    :" + chars);
		System.out.println("numerics :" + numerics);
		System.out.println("splchars :" + splchars);

	}

}
