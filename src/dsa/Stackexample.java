package dsa;

import java.util.Stack;

public class Stackexample {

	public static void main(String[] args) {
		
		Stack<Integer> stack =new Stack<Integer>();
		Stack<Integer> stack1 =new Stack<Integer>();
		
		stack1.add(16);
		System.out.println("Stack1 = "+stack1);
		System.out.println("is empty check:"+stack.isEmpty());
		
		stack.add(14);
		stack.push(10);
		stack.push(11);
		stack.add(15);
		stack.push(12);
		stack.push(13);
		
		System.out.println("Stack = "+stack);
		
		int last_removed_value=stack.pop();
		System.out.println("last_removed_value ="+last_removed_value);
		System.out.println("updated ="+stack);
		
		int last_removed_value_2=stack.remove(2);
		System.out.println("last_removed_value_2 ="+last_removed_value_2);
		System.out.println("updated ="+stack);
		
		int last_removed_value_3=stack.remove(3);
		System.out.println("last_removed_value_3 ="+last_removed_value_3);
		System.out.println("updated ="+stack);
		
		boolean a=stack.addAll(stack1);
		
		System.out.println("Adding 2 stacks(objects) = "+a);
		
		
		System.out.println("is empty check:"+stack.isEmpty());
		
		stack.clear();
		System.out.println("updated ="+stack);
		
		System.out.println("is empty check:"+stack.isEmpty());

	}

}
