package testdata;

public class StringAnagram {

	public static void main(String[] args) {
		String string1 = "abcdefghhgfedecba";
		String string2 = "";
		
		int[] arr = new int[26];
		
		for(int i=0; i<string1.length(); i++)
		{
			char m = string1.charAt(i);
            int p = m - (int)'a';
            arr[p]++;
		}
		
		int max = arr[0];
			
		for(int i=1; i<26; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		for(int i=0; i<26; i++)
		{
			int diff = max - arr[i];
			
			if(arr[i] == 0)
			{
				continue;
			}
			else if(arr[i] > 1)
			{
				string2 = "NO";
			}
		}
		
		if(string2 == "NO")
		{
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
			
		
		
	}

}
