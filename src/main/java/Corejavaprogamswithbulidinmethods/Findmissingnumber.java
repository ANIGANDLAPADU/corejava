package Corejavaprogamswithbulidinmethods;

public class Findmissingnumber {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5 };
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		for (int i = 0; i <= 5; i++) {
			sum1 = sum1 + i;
		}
		sum1 = sum1 - sum;
		System.out.println("Missing number from Arrays  :"+sum1);
	}
}
