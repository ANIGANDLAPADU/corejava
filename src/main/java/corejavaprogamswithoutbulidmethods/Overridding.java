package corejavaprogamswithoutbulidmethods;

class seshu {
	public void hello() {
		System.out.println("Hello Seshu");
	}

}

public class Overridding extends seshu {
	public void hello() {

		System.out.println("Hello Akhil");
		super.hello();
	}

	public static void main(String[] args) {
		Overridding or = new Overridding();
		or.hello();

	}

}
