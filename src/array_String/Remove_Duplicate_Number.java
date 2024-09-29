package array_String;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_Number {

	public static void main(String[] args) {
		int num = 5672764;
		int ans = removeDuplicate(num);
		System.out.println(ans);
		
	}

	public static int removeDuplicate(int num) {
		//convert integer to string by using valueOf()
		String snum = String.valueOf(num);
		StringBuffer sb = new StringBuffer();
		char[] cnum = snum.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		//Remove duplicate
		for(char c : cnum) {
			set.add(c);
		}
		for(char e : set) {
			sb.append(e);
		}
		// Step 1: Convert StringBuffer to String
		String ansSNum = sb.toString();

		// Step 2: Convert String to Integer
		Integer ans = Integer.valueOf(ansSNum);
		return ans;
	}


}
