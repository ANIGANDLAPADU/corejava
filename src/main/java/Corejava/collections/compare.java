package Corejava.collections;

public class compare {
	public static void main(String[] args) {
		String input1 = "New York";
		String input2 = "NWYR";

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < input2.length(); i++) {
			output.append(input2.charAt(i));
			if (i < input2.length() - 1) {
				output.append("+");
			}
		}

		System.out.println(output);
	}

}
