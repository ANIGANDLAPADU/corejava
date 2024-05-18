package com.String.corejava;

class Strings {

	public static String reverseAlphabetic(String input) {
		StringBuilder alphabetic = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				alphabetic.append(c);
			}
		}
		alphabetic.reverse();
		StringBuilder result = new StringBuilder();
		int index = 0;
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				result.append(alphabetic.charAt(index));
				index++;
			} else {
				result.append(c);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String input = "test1234epam6789";
		String reversed = reverseAlphabetic(input);
		System.out.println(reversed);
	}
}