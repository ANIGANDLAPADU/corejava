package Corejavaprogamswithbulidinmethods;

public class SumofNumber {

	public static void main(String[] args) {
		int i = 12345;
		int sum=0;
		while (i > 0) {
			int j = i % 10;
			i=i/10;
			sum =sum+j;
		}
		System.out.println(sum);
	}

}
