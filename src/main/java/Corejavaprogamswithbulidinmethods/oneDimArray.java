package Corejavaprogamswithbulidinmethods;

public class oneDimArray {
	public static void main(String[] args) {
		String a[] = { "seshu", "seshu", "seshu", "seshu", "babu", "karanam" };
		for (String x : a) {
			if (x.contains("seshu")) {
				System.out.println("duplicates string" + x);
			} else {
				System.out.println("not duplicate string" + x);
			}
		}

	}
}