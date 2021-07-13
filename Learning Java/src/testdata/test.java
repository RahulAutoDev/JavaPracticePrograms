package testdata;

import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		String s1 = "ccaa";
		String s2 = "cacc";
		
		int[] arr = new int[26];
		
		for(int i=0; i<s2.length(); i++)
		{
			arr[s1.charAt(i) -'a']++;
			arr[s2.charAt(i) - 'a']--;
		}
		
		for(int i=0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
