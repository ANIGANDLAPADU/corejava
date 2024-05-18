package Corejavaprogamswithbulidinmethods;

public class SequenceSmallandCapital {

	public static void main(String[] args) {
		String str = "auto";
		String str1 = "autoautomation";
         int count=0;
		String[] ch = str1.split(str);
		for(String c:ch) {
			if(c.contains(str)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
