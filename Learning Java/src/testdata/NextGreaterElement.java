package testdata;

public class NextGreaterElement {

	public static void main(String[] args) {
		
		int[] num1 = {2,4};
		int[] num2 = {1,2,3,4,0,3,9};
		int[] ans = new int[num1.length];
		
		for(int i=0; i<num1.length; i++)
		{
			int j =0;
			int flag = 0;
			while(num2[j] != num1[i]) j++;
			{
				for(int k=j; k<num2.length; k++)
				{
					if(num1[i] < num2[k])
					{
						ans[i] = num2[k];
						flag=1;
						break;
					}
				}
			}
			//j++;
			if(flag == 0) ans[i] = -1;
		}
		System.out.println(ans.toString());

	}

}
