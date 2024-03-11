package Exception;

class seshu {
	seshu(int i) {
		System.out.println(i);
	}

	seshu() {
		System.out.println("seshu");
	}
}

public class Display extends seshu {
	Display() {
        super(10);
		System.out.println("Dispaly");
	}

	public static void main(String[] args) {
		Display Display = new Display();
	}

}
