package testdata;

import org.jsoup.parser.Parser;

public class ArrayWithEvenCount {

	public static void main(String[] args) {
		int[] arr = {12,345,2,6,7896};
		int[] arr2 = {};
		
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			String s = Integer.toString(arr[i]);
			int a = s.length();
			
			if(a % 2 == 0)
			{
				count++;
			}
		}
		System.out.println("Val of Count: "+ count);
	}

}
