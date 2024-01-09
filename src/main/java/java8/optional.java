package java8;

import java.util.Optional;

public class optional {

	public static void main(String[] args) {
		String str = "";
		Optional<String> opt = Optional.ofNullable(str);
		if (opt.isPresent()) {
			System.out.println(opt.get());
		} else {
			System.out.println(opt.orElse("babu"));
		}

	}

}
