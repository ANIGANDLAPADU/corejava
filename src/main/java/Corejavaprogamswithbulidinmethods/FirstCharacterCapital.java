package Corejavaprogamswithbulidinmethods;

public class FirstCharacterCapital {

	public static void main(String[] args) {
		String str = "i am seshu babu";
		String[] str1 = str.split(" ");
		StringBuffer buffer = new StringBuffer();
		for (String s : str1) {
			if (!s.isEmpty()) {
				buffer.append(Character.toUpperCase(s.charAt(0)));
				buffer.append(s.substring(1));
				buffer.append(" ");
			}
		}
		System.out.print(buffer);

	}

}
