package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class seshu {
	int rollnum;
	String name;
	int marks;

	seshu(int rollnum, String name, int marks) {
		this.rollnum = rollnum;
		this.name = name;
		this.marks = marks;
	}

}

public class StreamAPIFlatmap {

	public static void main(String[] args) {
		List<seshu> array1 = new ArrayList<seshu>();
		array1.add(new seshu(1, "seshu", 30));
		List<seshu> array2 = new ArrayList<seshu>();
		array2.add(new seshu(2, "akhil", 20));
		List<seshu> array3 = new ArrayList<seshu>();
		array3.add(new seshu(3, "babu", 40));

		List<List<seshu>> abc = new ArrayList<List<seshu>>();
		abc.add(array1);
		abc.add(array2);
		abc.add(array3);
		abc.stream().flatMap(obj -> obj.stream()).map(o -> o.name.toUpperCase()).collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
