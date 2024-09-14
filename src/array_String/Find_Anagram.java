package array_String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Find_Anagram {

	public static void main(String[] args) {
		String s = "kasa";
		String t = "saka";
		 if(checkAnagram1(s,t)) {
			 System.out.println("checkAnagram1: Anagram");
		 }else {
			 System.out.println("checkAnagram1: not anagram");
		 }
		 
		 if(checkAnagram2(s,t)) {
			 System.out.println("checkAnagram2: Anagram");
		 }else {
			 System.out.println("checkAnagram2: not anagram");
		 }

	}
 
	private static boolean checkAnagram2(String s, String t) {
		//O(N)
		//create char array of 2 strings
		//store char & its respective occurrences in hmap
		//increment the no. of occ in 1st hmap of s1
		//decrement the no. of occ in hmap of s2
		if(s.length() != t.length()) {
			return false;
		}
		char[] sch = s.toCharArray(); char[] tch = t.toCharArray();
		Map<Character, Integer> hmap = new HashMap<>();
		for(char count : sch) {
			if(hmap.containsKey(count)) {
				hmap.put(count, hmap.get(count)+1);
			} else {
				hmap.put(count,1);
			}
		}
		
		for(char count : sch) {
			if(hmap.containsKey(count)) {
				hmap.put(count, hmap.get(count)-1);
			} else {
				hmap.put(count,1);
			}
		}
		
		for(Integer val : hmap.values()) {
			if(val != 0) {
				return false;
			}
		}
		return true;
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
