package Corejavaprogams;

public class CountSumofDigits {

	public static void main(String[] args) {
		int i = 1233445464;
		int sum = 0;
		while (i > 0) {
			int j = i%10;
			sum = sum +j;
			i = i / 10;
		}

		System.out.println("sum of Digits are :" + sum);

	}

}
