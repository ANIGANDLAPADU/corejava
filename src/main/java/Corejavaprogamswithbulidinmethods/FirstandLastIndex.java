package Corejavaprogamswithbulidinmethods;

public class FirstandLastIndex {

	public static void main(String[] args) {
		String str = "seshubabukaranam";
		int first = 1, last = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				if (first == 1) {
					first = i;
				}
				last = i;
			}
		}
		System.out.println("First occurrence of 'a': " + first);
        System.out.println("Last occurrence of 'a': " + last);
	}

}
