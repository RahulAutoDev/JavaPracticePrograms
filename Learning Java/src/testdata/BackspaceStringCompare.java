package testdata;

import java.util.Stack;

public class BackspaceStringCompare {
	
	public static Stack returnStringStack(String s)
	{
		Stack stack = new Stack();
		
		
		for(int i=0; i< s.length(); i++)
		{
			if(s.charAt(i) != '#')
			{
				stack.push(s.charAt(i));
			}
			else if(!stack.empty())
			{
				stack.pop();
			}
		}
		
		return stack;
	}
	

	public static void main(String[] args) {
		String s = "a#c";
		String t = "b";
		
		Stack stack1 = returnStringStack(s);
		Stack stack2 = returnStringStack(t);
		
		if(stack1.equals(stack2))
		{
			System.out.println("TRUE.....");
		}
		else {
			System.out.println("FALSE.....");
		}
	}

}
