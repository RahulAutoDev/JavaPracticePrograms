package testdata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrayAndFindMedian {

	public static void main(String[] args) {
		int[] arr1 = {1, 5, 3, 4, 2}; 
		int[] arr2 = {7,8,9};
		
		int k=2;
		int res = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		for(int i=0; i<arr1.length-1; i++)
		{
			for(int j=i+1; j<arr1.length; j++)
			{
				if(arr1[i] - arr1[j] == k)
				{
					res++;
					System.out.println(arr1[i] + "" + arr1[j]);
				}
				else if(arr1[j] - arr1[i] == k){
					res++;
					System.out.println(arr1[i] + "" + arr1[j]);
				}
			}
		}
		
		System.out.println("Val of res: " + res);
		
	}

}
