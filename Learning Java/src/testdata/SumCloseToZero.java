package testdata;

public class SumCloseToZero {

	public static void main(String[] args) {
		int[] arr = {1, 60, -10, 70, -80, 85};
		int i= 0;
		int j= 1;
		int diff = 0;
		int min_l = 0;
	    int min_r = 1;
	    int diffm = arr[0] + arr[1];
	    
		while(j < arr.length && i < arr.length-1)
		{
			diff = Math.abs(arr[i] + arr[j]);
			if(diff < diffm)
			{
				diffm = diff;
				min_l = i;
			    min_r = j;
			    j++;
			}
			else {
				j++;
			}
			if(j == arr.length)
			{
				i++;
				j=i+1;
			}
			
		}
		
		System.out.println(arr[min_l] + " " + arr[min_r]);

	}

}
