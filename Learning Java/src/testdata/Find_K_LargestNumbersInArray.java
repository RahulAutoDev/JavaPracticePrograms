package testdata;

import java.util.Arrays;

public class Find_K_LargestNumbersInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,9,5,0};
		int[] arr1 = new int[2];
		int k = 2;
		int max = arr[0];
		int min = arr[0];
		int res = 0;
		int tt = 0;
		
		for(int i=0; i<k; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(max < arr[j+1] && arr[j+1] != res)
				{
					max = arr[j+1]; 
					tt = j+1;
				}
			}
			//System.out.println("min val :" + min);
			res = max;
			arr1[i] = res;
			arr[tt] = 0;
			max = arr[0];
			
		}
		System.out.println("Array val is: " + Arrays.toString(arr1));
		
	}

}
