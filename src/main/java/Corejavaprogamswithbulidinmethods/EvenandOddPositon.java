package Corejavaprogamswithbulidinmethods;

public class EvenandOddPositon {

	public static void main(String[] args) {

		String[] str = { "seshu", "babu", "karanam", "ok" };
		for (int i = 0; i < str.length; i += 2) {
			System.out.println("at even position :" + str[i]);
		}
		for (int i = 1; i < str.length; i += 2) {
			System.out.println("at odd position :" + str[i]);
		}

	}

}
