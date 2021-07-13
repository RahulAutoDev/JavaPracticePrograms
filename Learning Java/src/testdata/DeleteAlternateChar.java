package testdata;

public class DeleteAlternateChar {

	public static void main(String[] args) {
		
		String name = "AAABBB";
		int count = 0;
		int j = 0;
		
		char[] arr = name.toCharArray();
		
		for(int i=0; i<arr.length; )
		{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					continue;
				}
				else
				{
					break;
				}
			}
			i = j;
		}
		System.out.println("The val of count: "+ count);

	}

}
