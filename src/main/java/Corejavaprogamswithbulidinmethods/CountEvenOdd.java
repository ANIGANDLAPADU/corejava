package Corejavaprogamswithbulidinmethods;

public class CountEvenOdd {

	public static void main(String[] args) {
		int number = 123456;
		int even_count = 0;
		int odd_count = 0;
		while (number > 0) {
			int num = number % 10;
			if (num % 2 == 0) {
				even_count++;

			} else {
				odd_count++;

			}
			number = number / 10;
		}
		System.out.println("Even numbers :" + even_count);
		System.out.println("Odd Numbers :" + odd_count);

	}

}
