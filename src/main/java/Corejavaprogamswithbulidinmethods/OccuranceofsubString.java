package Corejavaprogamswithbulidinmethods;

public class OccuranceofsubString {

	public static void main(String[] args) {
		String str = "auto";
		String str1 = "autoautomation";
		int count = 0;
		int index = 0;

		while ((index = str1.indexOf(str, index)) != -1) {
		    count++;
		    index += str.length(); // Move past the matched "auto"
		}
		System.out.println(count);  // Outputs: 2

	}
}
