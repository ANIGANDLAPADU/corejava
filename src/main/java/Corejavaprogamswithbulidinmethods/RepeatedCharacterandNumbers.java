package Corejavaprogamswithbulidinmethods;

public class RepeatedCharacterandNumbers {

	public static void main(String[] args) {

		int str2[] = { 100, 100, 100, 10 };
		for (int i = 0; i < str2.length; i++) {
			for (int j = i + 1; j < str2.length; j++) {
				if (str2[i] == str2[j]) {
					System.out.println(str2[j]);
				}
			}
		}

		/*
		 * String str3[] = { "seshu", "seshu", "babu" }; for (int k = 0; k <
		 * str3.length; k++) { for (int a = k + 1; a < str3.length; a++) { if (str3[k]
		 * == str3[a]) { System.out.println(str3[a]); } }
		 */

		/*
		 * String str = "seshubabu"; int length = str.length(); char ch[] =
		 * str.toCharArray(); for (int l = 0; l < length; l++) { for (int m = l + 1; m <
		 * length; m++) { if (ch[l] == ch[m]) { System.out.println(ch[m]); break; }
		 * 
		 * } }
		 */
	}
}
