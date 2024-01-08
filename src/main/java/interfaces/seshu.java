package interfaces;

public class seshu extends abc {

	public static void main(String[] args) {
		abc bc = new seshu();
		abc.hello();
		bc.Hi();
		abc.welcome();
		System.out.println(abc.i);
		System.out.println(abc.j);
	}

	public void Hi() {
		System.out.println("hello");

	}

}
