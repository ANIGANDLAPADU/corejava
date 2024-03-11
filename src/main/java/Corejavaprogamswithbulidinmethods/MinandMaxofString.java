package Corejavaprogamswithbulidinmethods;

public class MinandMaxofString {

	public static void main(String[] args) {
		String str = "seshu babu karanam";
		String[] str1 = str.split(" ");
		String min = str1[0];
		String max = str1[0];
		for (String st : str1) {
			if (st.length() > max.length()) {
				max = st;
			} else if (st.length() < min.length()) {
				min = st;
			}
		}
		System.out.println("minimum length string :"+min);
		System.out.println("maximum length string :"+max);
	}

}
