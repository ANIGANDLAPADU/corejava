package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	int Salary;
	String name;

	Employee(String name, int Salary) {
		this.Salary = Salary;
		this.name = name;
	}
}

public class consumer {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("seshu", 20000));
		list.add(new Employee("akhil", 10000));
		list.add(new Employee("seshu", 30000));
		// function
		Function<Employee, Integer> fun = f -> f.Salary * 20 / 100;
		// predicate
		Predicate<Integer> pre = p -> p > 5000;
		// consumer
		Consumer<Employee> con = c -> {

			System.out.println(c.Salary);
			System.out.println(c.name);

		};

		for (Employee emp : list) {
			int bonus = fun.apply(emp);
			if (pre.test(bonus)) {
				con.accept(emp);
				System.out.println(bonus);
			}
		}
		 //consumer chaining
		Consumer<String> cow = c -> System.out.println(" "+c);
		Consumer<String> cow1 = c -> System.out.println(" "+c);
		Consumer<String> cow2 = c -> System.out.println(" "+c);
		cow.andThen(cow1).andThen(cow2).accept("seshu");
	   

	}
}