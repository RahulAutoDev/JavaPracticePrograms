package testdata;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,5,6,7,8};
		
		//Scanner scan = new Scanner(System.in);
		int userNum = 8;
		
		int low = 0;
		int high = arr.length;
		
		while(true)
		{
			int mid = (low+high)/2;
			
			if(arr[mid] == userNum)
			{
				System.out.println("FOUND....");
				break;
			}
			else if(arr[mid] > userNum)
			{
				high = mid;
			}
			else if(arr[mid] < userNum){
				low = mid;
			}
		}
	}

}
