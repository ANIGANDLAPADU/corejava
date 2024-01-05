package java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		String  str ="seshu";
		/*using ofNullable() method*/
		Optional<String> optional= Optional.ofNullable(str);
		if(optional.isPresent()) {
			System.out.println("Value is :"+optional.get());
		}else {
			System.out.println("value is not present :"+optional.orElse("seshu"));
		}
		/*using of() method*/
		Optional<String> op= Optional.of(str);
		if(op.isPresent()) {
			System.out.println("Value is :"+op.get());
		}else {
			System.out.println("value is not present :"+op.orElse("seshu"));
		}
	}

}