package array_String;

import java.util.Arrays;

public class Find_Anagram {

	public static void main(String[] args) {
		String s = "asa";
		String t = "saka";
		 if(checkAnagram1(s,t)) {
			 System.out.println("checkAnagram1: Anagram");
		 }else {
			 System.out.println("checkAnagram1: not anagram");
		 }
	}

	public static boolean checkAnagram1(String s, String t) {
		// O(NlogN)
		//create char array of 2 strings 
		//sort both arrays
		//check if both arrays are equal or not
		if(s.length() != t.length()) {
			return false;
		}
		char[] sch = s.toCharArray(); char[] tch = t.toCharArray();
		Arrays.sort(sch);
		Arrays.sort(tch);
		
		if(Arrays.equals(sch,tch)) {
			return true;
		}
		
		return false;
	}

}
