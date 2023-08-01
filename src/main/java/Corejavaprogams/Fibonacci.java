package Corejavaprogams;

public class Fibonacci {

	public static void main(String[] args) {
		int i = 0, j = 1, k = 1;
		while (i <= 50) {
			i = j + k;
			System.out.println(i);
			j = k;
			k = i;
		}

	}

}
