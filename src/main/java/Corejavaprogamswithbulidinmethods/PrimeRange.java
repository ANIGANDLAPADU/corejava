package Corejavaprogamswithbulidinmethods;

public class PrimeRange {

	public static void main(String[] args) {
		int sum=10;
		int flag = 0;
		for (int i = 1; i <= sum; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(i+"  ");
			}

		}

	}

}
