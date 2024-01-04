package Corejava.collections;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("seshu");
		stack.push(1);
		stack.add('c');
		System.out.println(stack.peek());//seraching in LIFO
		System.out.println(stack.pop());//delete in LIFO
		System.out.println(stack.search("seshu"));

	}

}
