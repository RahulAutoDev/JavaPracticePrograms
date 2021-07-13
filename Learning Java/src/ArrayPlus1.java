import java.util.Arrays;

public class ArrayPlus1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4};
		String joinedString = Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");
		String res = "";
		
		for(int i=0; i<joinedString.length(); i++)
		{
			res = res + joinedString.charAt(i);
		}
	
		int num = Integer.parseInt(res);
		num = num+1;
		
		String temp = Integer.toString(num);
		
		for(int i=0; i<temp.length(); i++)
		{
			System.out.print(temp.charAt(i));
		}
		// new 

	}

}
