package testdata;

public class StringHalfsAreSame {

	public static void main(String[] args) {
		String string = "textbook";
		int first_half = string.length()/2;
		int sec_half = string.length() - first_half;

		String s1 = string.substring(0, first_half);
		String s2 = string.substring(sec_half);
		char[] vol = {'u','o','i','e','a'};
		
		//System.out.println(s1 + " " + s2);
		
		//System.out.println(s1.matches("[aeiou]"));
		
		int first_count = 0;
		int sec_count = 0;
		
		for(int i=0; i<s1.length(); i++)
		{
			for(int j=0; j<vol.length;j++)
			{
				if(s1.charAt(i) == vol[j])
				{
					first_count++;
				}
			}
		}
		
		for(int i=0; i<s2.length(); i++)
		{
			for(int j=0; j<vol.length;j++)
			{
				if(s2.charAt(i) == vol[j])
				{
					sec_count++;
				}
			}
		}
		
		if(first_count == sec_count)
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
	}

}
