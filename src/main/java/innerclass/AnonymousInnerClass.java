package innerclass;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Abstract ab = new Abstract() {
			public void karanam() {
				System.out.println("seshu babu");
			}
		};
		ab.karanam();

	}

}
