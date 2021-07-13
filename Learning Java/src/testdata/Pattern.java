package testdata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pattern {

	public static void main(String[] args) {
		
		int[] num1 = {1,2,3,0,0,0};
		int[] num2 = {2,5,6};
		int m = 3;
		int n = 3;
		int p1 = m-1;
		int p2 = n-1;
		int i = m + n -1;
		
		while(p2>=0)
		{
			if(p1>=0 && num1[p1] > num2[p2])
			{
				num1[i--] = num1[p1--];
			}
			else{
				num1[i--] = num2[p2--];
			}
		}
		System.out.println(Arrays.toString(num1));

	}

}
