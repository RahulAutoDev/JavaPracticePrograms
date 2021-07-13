package testdata;

public class FlipCoins {
	
	public static String flipcoin()
	{
		String string =  "000";
		
		char[] arr = string.toCharArray();
		
		int m = arr.length;
		boolean name1 = false;
		
		for(int k=0; k<arr.length;)
		{
			if(k == m-1 && arr[k] == 48)
			{
				name1 = false;
				break;
			}
			else if(arr[k] == 48 && arr[k+1] == 48)
			{
				k = k + 2;
				name1 = true;
			}
			else if(arr[k] == 48 && arr[k+1] != 48)
			{
				name1 = true;
				break;
			}
			else {
				k++;
			}
		}
		return Boolean.toString(name1);
		
	}

	public static void main(String[] args) {
		
		String data = flipcoin();
		System.out.println(data);
	}

}
