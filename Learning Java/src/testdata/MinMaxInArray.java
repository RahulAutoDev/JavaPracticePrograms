package testdata;

public class MinMaxInArray {

	public static void main(String[] args) {
		
		int[] arr = {98,9,0,1,10,3};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length-1;i++)
		{
			if(min > arr[i+1])
			{
				min = arr[i+1];
			}
			else if(max < arr[i+1])
			{
				max = arr[i+1];
			}
		}
		
		System.out.println(min + " " + max);
		
		

	}

}
