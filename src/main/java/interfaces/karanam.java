package interfaces;

public class karanam extends babu implements srinivas,veera{

	public static void main(String[] args) {
		
		karanam k = new karanam();
		k.m1();
		k.m2();
	}

	@Override
	public void m1() {
		System.out.println("hello m1");
		
	}

	@Override
	public void m2() {
		System.out.println("hello m2");
		
	}

}
