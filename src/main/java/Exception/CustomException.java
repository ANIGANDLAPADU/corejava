package Exception;

interface exception {
	public void seshu();

	 void babu();
}

public class CustomException implements exception {
	public static void main(String[] args) {
		CustomException customException = new CustomException();
		customException.babu();

	}

	@Override
	public void seshu() {

	}

	@Override
	public void babu() {
		// TODO Auto-generated method stub
		
	}

}
