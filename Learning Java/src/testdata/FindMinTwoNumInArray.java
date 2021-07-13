package testdata;

import java.util.ArrayList;

public class FindMinTwoNumInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,8,0,9,2,5};
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] < first)
			{
				second = first;
				first = arr[i];
			}
			else if(second > arr[i] && arr[i] != first)
			{
				second = arr[i];
			}
		}
		System.out.println(first + " " + second);
		
	}

}
