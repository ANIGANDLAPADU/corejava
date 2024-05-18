package Corejavaprogamswithbulidinmethods;

public class Career {
	public static String reverseString(String line) {
	    String[] words = line.split(" ");
	    StringBuilder reversedLine = new StringBuilder();
	    
	    for (String word : words) {
	        StringBuilder reversedWord = new StringBuilder();
	        for (int i = word.length() - 1; i >= 0; i--) {
	            reversedWord.append(word.charAt(i));
	        }
	        reversedLine.append(reversedWord).append(" ");
	    }
	    
	    return reversedLine.toString();
	}

	public static void main(String[] args) {
	    System.out.print(reverseString("seshu babu"));	
	}

}
