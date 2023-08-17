package interfaces;

public interface abc {
	int i = 100;
	int j = 200;

	default void hello() {
		System.out.println("Hello ");
	}

	static void welcome() {
		System.out.println("Hello ");
	}

	void Hi();
}
