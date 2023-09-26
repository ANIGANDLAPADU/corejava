package Corejavaprogamswithbulidinmethods;

public class OccuranceofSingeCharacter {

	public static void main(String[] args) {
		String str = "seshubabu";
		int total = str.length();
		int afterremove = str.replace("s", "").length();
		int remove=total-afterremove;
       System.out.println(remove);
	}

}
