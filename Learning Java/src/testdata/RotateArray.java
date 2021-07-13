package testdata;

import java.util.Arrays;

public class RotateArray {
	
	public static void rotateRight(int[] nums, int Num)
	{
		int temp = nums[nums.length-1];
		
		for(int i=nums.length-1; i>0; i--)
		{
			nums[i] = nums[i-1];
		}
		nums[0] = temp;
		
		System.out.println("Right rotate: " + Arrays.toString(nums));
	}
	
	public static void rotateleft(int[] nums, int Num)
	{
		int temp = nums[0];
		
		for(int i=0;i<nums.length-1;i++)
		{
			nums[i] = nums[i+1];
		}
		nums[nums.length-1] = temp;
		
		System.out.println("Left rotate: " + Arrays.toString(nums));
	}

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,5,6};
		int rotateNum = 3;
		
		//rotateRight(arr, rotateNum);
		rotateleft(arr, rotateNum);
		

	}

}
