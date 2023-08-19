package interfaces;

public class classB extends classA {
	int i = 20;
	

	public void seshu() {
		super.seshu();
		System.out.println(super.i);
		System.out.println("hello good morning ...");
	}

	public static void main(String[] args) {
		classB b = new classB();
		System.out.println(b.i);
		b.seshu();
	}
}
