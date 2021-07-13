package testdata;

public class BeautifulSubString {

	public static void main(String[] args) {
		String s = "010010010";
		String res = "";
		String name = "";
		
		for(int i=0; i<s.length()-2;i++)
		{
			if(s.charAt(i) == '0')
			{
				name = s.substring(i, i+3);
				//res += name;
				
				if(name.equals("010"))
				{
					System.out.println("Sub String val is: " + name);
					
				}
			}
			else {
				res += s.charAt(i);
			}

		}
		
		
	}

}
