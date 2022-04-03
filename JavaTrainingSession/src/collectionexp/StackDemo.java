package collectionexp;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
	
	/*
	 * sam<--Top item
	 * Ayush
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack<String> stack = new Stack();
		stack.push("Ayush");
		stack.push("Sam");
		
		
		stack.pop();
		
	
		
		
		
		
		
		
		for(String s:stack)
		{
			System.out.println(s);
		}

	}

}
