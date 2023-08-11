package Corejavaprogamswithbulidinmethods;

public class countoddeven {

	public static void main(String[] args) {
		int num = 1234; 
		int even_count = 0;
		int odd_count = 0;
		while (num > 0) {
			int last = num % 10;
			if (last % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			num = num / 10;

		}
		System.out.println("Even numbers" + even_count);
		System.out.println("Odd Numbers" + odd_count);

	}

}
