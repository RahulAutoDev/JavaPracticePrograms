package testdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseBallGame {

	public static void main(String[] args) {
		
		
		//List<String> s1 = ["5","2","C","D","+"];
		
		String[] s = {"5","-2","4","C","D","9","+","+"};

		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].equals("+"))
			{
				int sum = stack.pop();
				int sum1 = stack.peek();
				int total = sum + sum1;
				stack.push(sum);
				stack.push(total);
			}
			else if(s[i].equals("D"))
			{
				int doubleData = stack.peek() * 2;
				stack.push(doubleData);
			}
			else if(s[i].equals("C"))
			{
				stack.pop();
			}
			else {
				int data1 = Integer.parseInt(s[i]);
				stack.push(data1);
			}
		}
		
		int data = 0;
		
		for(Integer ele : stack)
		{
			data += ele; 
		}
		
		System.out.println("The val of data: " + data);

	}

}
