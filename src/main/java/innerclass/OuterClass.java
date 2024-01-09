package innerclass;

public class OuterClass {
	private int i = 100;

	public static void main(String[] args) {
		InnerClass innerClass = new OuterClass().new InnerClass();
		innerClass.seshu();
		innerClass.babu();
		innerClass.karanam();

	}

	public class InnerClass extends Abstract implements Interface {
		private int i = 100;

		public void seshu() {
			System.out.println("hello");
			System.out.println(i);
			System.out.println(OuterClass.this.i);
		}

		@Override
		public void babu() {
			System.out.println("hello babu");

		}

		@Override
		public void karanam() {
			System.out.println("hello karanam");

		}

	}

}
