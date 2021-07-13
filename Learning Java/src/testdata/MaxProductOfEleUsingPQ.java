package testdata;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxProductOfEleUsingPQ {

	public static void main(String[] args) {
		
		int[] nums = {3,4,5,2};
		// Optimize solution : find two max numbers and take their product.
		
		PriorityQueue pq = new PriorityQueue<>(Comparator.reverseOrder());

		int i=0;
		int mul =0;
		
		while(i<nums.length)
		{
			int j=i+1;
			while(j < nums.length)
			{
				mul = (nums[i]-1) * (nums[j]-1);
				pq.offer(mul);
				j++;
			}
			i++;
		}
		System.out.println(pq);
	}

}
