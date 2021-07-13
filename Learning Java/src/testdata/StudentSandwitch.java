package testdata;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StudentSandwitch {

	public static void main(String[] args) {
		
		int[] students = {1,1,1,0,0,1};
		int[] sandwiches = {1,0,0,0,1,1};
		
		Queue qu = new LinkedList<>();
		Stack stack = new Stack();
		
		for(int i=0; i<students.length; i++)
		{
			qu.offer(students[i]);
		}
		
		for(int i=sandwiches.length-1; i>=0; i--)
		{
			stack.push(sandwiches[i]);
		}
		
		int count = 0;
		
		for(int i=0; i<stack.size() * qu.size(); i++)
		{

			if((!stack.isEmpty()) && qu.peek() == stack.peek())
			{
				qu.poll();
				stack.pop();
			}
			
			if((!stack.isEmpty()) && qu.peek() != stack.peek()) {
				Object stuTop = qu.peek();
				qu.poll();
				qu.offer(stuTop);
			}
			
			count = qu.size();
		}
		
		System.out.println(count);
		
	}

}
