package interfaces;

interface b {
	int j = 100;

	public void g();
}

interface c {
	int k=100;
	public void g();
}

public class a implements b,c {
	@Override
	public void g() {
		System.out.println("hello");

	}

	public static void main(String[] args) {
		a ab = new a();
		ab.g();
	    System.out.println(ab.k);
	}
}
