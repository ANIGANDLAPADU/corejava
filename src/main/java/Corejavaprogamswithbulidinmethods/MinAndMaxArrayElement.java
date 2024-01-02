package Corejavaprogamswithbulidinmethods;

public class MinAndMaxArrayElement {

	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 87, 7 };
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Maxminum value is  " + max);
		System.out.println("mininum value is  " + min);
	}

}
