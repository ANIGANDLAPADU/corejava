package corejavaprogamswithoutbulidmethods;

public class Occurance {
	public static void main(String[] args) {
		int i = 1, j = 1, k = 0;
		while (k <= 50) {
			k = i + j;
			System.out.println(k);
			i = j;
			j = k;

		}
	}
}