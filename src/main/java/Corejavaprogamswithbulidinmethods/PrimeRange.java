package Corejavaprogamswithbulidinmethods;

public class PrimeRange {

	public static void main(String[] args) {
		int sum = 7;
		for (int i = 2; i <= sum; i++) {
			boolean isprime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				System.out.println(i);
			}
		}
	}

}
