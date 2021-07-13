package testdata;

public class ArrayAnagram {

	public static void main(String[] args) {
		String s = "aacc";
		String t = "ccac";
		String name = "";

		char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        while(true)
        {
        		if(arr1.length != arr2.length)
        		{
        			System.out.println("NO");
        			break;
        		}
        		
        		for(int i=0; i< arr1.length; i++)
        		{
        			for(int j=0; j<arr2.length; j++)
        			{
        				if(arr1[i] == arr2[j])
        				{
        					name = "Yes";
        					arr2[j] = '0';
        					break;
        				}
        				else {
        					name = "NO";
        				}
        			}
        		}
        		break;
        }
        
        
		if(name == "Yes")
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
        
	}

}
