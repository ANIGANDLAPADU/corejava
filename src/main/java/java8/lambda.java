package java8;

public class lambda {

	public static void main(String[] args) {
		functionalinterface functionalinterface = (i, j) -> {
			{
				String k;
				k = i + " " + j;
				System.out.println("hello " + k);
			}
		};
		functionalinterface.add("seshu", "babu");
	}
}
