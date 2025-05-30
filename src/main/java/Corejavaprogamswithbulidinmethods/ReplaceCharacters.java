package Corejavaprogamswithbulidinmethods;

public class ReplaceCharacters {

	public static void main(String[] args) {
		String str = "seshubabukaranam";
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 's') {
				count++;
				if (count == 1) {
					ch[i] = 'a';
				} else if (count == 2) {
					ch[i] = 'b';
				}
			}
		}
		String str1 = new String(ch);
		System.out.println(str1);

	}

}
