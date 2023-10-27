package corejavaprogamswithoutbulidmethods;

public class OverLoading {
	public void add() {

		System.out.println("Hi");
	}

	public void add(int d, int c) {
		int e = d + c;
		System.out.println(e);
	}

	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.add(10, 100);
		ol.add();

	}

}
