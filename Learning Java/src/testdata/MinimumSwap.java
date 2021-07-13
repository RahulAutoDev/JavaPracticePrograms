package testdata;

public class MinimumSwap {

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,1,5};
//		int count = 0;
//		int valj = 0;
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			int min = arr[i];
//			int premin = min;
//			
//			for(int j=i+1; j<arr.length; j++)
//			{
//				if(min > arr[j])
//				{	
//					min = arr[j];
//					valj = j;
//				}	
//			}
//			if(premin == min)
//			{
//				continue;
//			}else {
//				count++;
//				int temp = arr[i];
//				arr[i] = min;
//				arr[valj] = temp;
//			}
//		}
//		
//		System.out.println("Val of count: "+count);
		
		int count = 0;
		for(int k = 0; k<arr.length; k++)
		{
			//System.out.println(arr[k]);
			
			if(arr[k]==k+1) 
			{
				continue;
			}
	        
			count++;
            int tmp = arr[k];
            arr[k] = arr[tmp-1];
            arr[tmp-1] = tmp;
            k--;
            
		}
		
		System.out.println("Val of count: "+count);
		
		
		
	}

}
