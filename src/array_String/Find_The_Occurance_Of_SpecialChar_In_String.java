package array_String;
import java.util.*;
public class Find_The_Occurance_Of_SpecialChar_In_String {

	public static void main(String[] args) {
		String str = "aS@#6# jijk#%^&&&ujm173i3 %qjw%bdikd%";
		//op -> @:1 #:2
		//convert string to char Array
		//create a hashmap with key: char val:Int
		//iterate each char & check through its ASCII value
		//if present previously then increment its freq. 
		//if not present then initiate the freq.
		Map<Character, Integer> hmap = new HashMap<>();
		char[] chArr = str.toCharArray();
		for(char c : chArr) {
			//if(!Character.isLetterOrDigit(c)) {
			if(!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
				if(hmap.containsKey(c)) {
					hmap.put(c, hmap.get(c)+1);
				} else {
					hmap.put(c, 1);
				}
			}
		}
		System.out.println(str + " : "+hmap);
		for(char e : hmap.keySet()) {
			System.out.println("Key is : " + e + " value is: "+hmap.get(e));
		}
	}

}
