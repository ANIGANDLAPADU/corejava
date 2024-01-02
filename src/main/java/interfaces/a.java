package interfaces;

interface b {
	public void g();
}

interface c {
	public void g();
}

public class a implements b,c {
	public static void main(String[] args) {
       a ab= new a();
          ab.g();
	}

	@Override
	public void g() {
		System.out.println("hello");
		
	}
}
