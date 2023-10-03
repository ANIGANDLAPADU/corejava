package Corejavaprogamswithbulidinmethods;

public class RemoveStringsEndingWithS {
	public static void Endswith(String a[]) {
		for (String str : a) {
			if (!str.endsWith("s")) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		String a[] = { "test", "tests", "tester", "testers"};
		Endswith(a);
	}
}
