package corejavaprogamswithoutbulidmethods;

 abstract class srinivas {
	public  abstract int seshu();

	public abstract void babu();

}

public class akhil extends srinivas {
	public static void main(String[] args) {
      akhil ak = new akhil();
      ak.babu();
      ak.seshu();
	}

	@Override

	public int seshu() {
		return 0;

	}

	@Override
	public void babu() {

	}

}
