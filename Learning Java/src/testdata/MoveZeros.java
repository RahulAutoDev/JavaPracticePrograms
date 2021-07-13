package testdata;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		
		int[] nums = {0,1,0,3,12};
		int j=0;
		int i=0;
		
		while(j < nums.length)
		{
			if(nums[j] != 0)
			{
				nums[i++] = nums[j];
			}
			j++;
		}
		
		while(i<nums.length)
		{
			nums[i++] = 0;
		}
		
		System.out.println(Arrays.toString(nums));

	}

}
