package Exception;

class Example1 {
	//18004254026- ext 1107304
	final static int i = 100;

	public void seshu() {
		System.out.println("i am from example1");
	}

	public void seshubabu() {
		System.out.println("i am from seshubabu");
	}
}

public class Example extends Example1 {
	public void seshu() {
		super.seshu();
		super.seshubabu();
		System.out.println("i am from example  :" + i);
	}

	public static void main(String[] args) {
		Example example = new Example();
		example.seshu();
	}
}
