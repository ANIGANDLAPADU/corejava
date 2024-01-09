package innerclass;

import innerclass.OuterClass.InnerClass;

public class anotherclass {

	public static void main(String[] args) {
		InnerClass class1 = new OuterClass().new InnerClass();
		class1.seshu();
	}

}
