package array_String;

import java.util.HashMap;
import java.util.Map;

public class Find_number_of_occ_of_char_in_string {

	public static void main(String[] args) {
		String str = "abacbdabac";
		findOccNum(str);
	}

	public static void findOccNum(String str) {
		Map<Character, Integer> hmap = new HashMap<>();
		char[] chArr = str.toCharArray();
		for(char c : chArr) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			} else {
				hmap.put(c, 1);
			}
		}
		System.out.println(str + " : "+ hmap);
	}
}
