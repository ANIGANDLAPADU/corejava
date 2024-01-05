package Corejavaprogamswithbulidinmethods;

public class MinAndMaxArrayElement {

	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 87, 7 };
		int max = a[0];
		int min = a[0];
		for (int c : a) {
			if (c > max) {
				max = c;
			} else if (c < min) {
				min = c;
			}
		}
		System.out.println("Maxminum value is  " + max);
		System.out.println("mininum value is  " + min);
	}

}
