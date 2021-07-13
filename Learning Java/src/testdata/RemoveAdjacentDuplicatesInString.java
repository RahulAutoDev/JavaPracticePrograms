package testdata;

import java.util.Stack;

public class RemoveAdjacentDuplicatesInString {

	public static void main(String[] args) {
		
		String s = "aabbaca";
		
		char[] stack = new char[s.length()];
		
		int i=0;
		
		for(int j=0; j< s.length(); j++)
		{
			char val = s.charAt(j);
			
			if(i > 0 && stack[i-1] == val)
			{
				i--;
			}
			else {
				stack[i] = val;
				i += 1;
			}
		}
		
		System.out.println(stack);

	}

}
