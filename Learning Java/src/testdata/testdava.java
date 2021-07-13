package testdata;

public class testdava {
	
	public static void Compare(String name, String data)
	{
		System.out.println(name.compareTo(data));
	}
	public static void Compare(int aa, int bb)
	{
		if(aa == bb)
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	private static void Compare(int[] arr, int[] aee) {
		String val1 = "true";
		String val2 = "false";
		String val3 = "";
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == aee[i])
			{
				val3 = val1;
			}
			else
			{
				val3 = val2;
				break;
			}
		}
		
		System.out.println(val3);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Rahu2l";
		String data = "Rahu2l";
		int arr[] = {1,2,3};
		int aee[] = {1,2,3};
 		
		//Compare(name , data);
		//Compare(22 , 22);
		Compare(arr , aee);
		
		
	}


}
