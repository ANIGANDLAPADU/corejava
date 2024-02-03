package Exception;

interface exception {
	public void seshu();

	default void babu() {
		System.out.println(this.getClass());

	}
}

public class CustomException implements exception {
	public static void main(String[] args) {
		CustomException customException = new CustomException();
		customException.babu();

	}

	@Override
	public void seshu() {

	}

}
