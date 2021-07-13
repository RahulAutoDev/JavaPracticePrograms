package testdata;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TheKWeakestRowsinaMatrix {

	public static void main(String[] args) {
		
		int[][] arr = { 
		 {1,1,0,0,0},
		 {1,1,1,1,0},
		 {1,0,0,0,0},
		 {1,1,0,0,0},
		 {1,1,1,1,1}, };
		
		PriorityQueue pq = new PriorityQueue<>();
		int[] nums = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=0; j < arr.length; j++)
			{
				if(arr[i][j] == 1)
				{
					count++;
				}
			}
			//pq.offer(count);
			nums[i] = count;
		}
		
		System.out.println(pq);
		System.out.println(Arrays.toString(nums));
		


	}

}
