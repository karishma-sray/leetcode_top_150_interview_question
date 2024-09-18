package array_String;

import java.util.LinkedHashSet;
import java.util.Set;

public class Longest_consecutive_sub_sequence_in_array {

	public static void main(String[] args) {
		int[] arr = {1,3,101,102,2,4,1,1};
		int longestConsecutive = findLongestConsecutive(arr);
		System.out.println(longestConsecutive);

	}

	private static int findLongestConsecutive(int[] arr) {
		int n = arr.length;
		if(n == 0 || n == 1) {
			return n;
		}
		Set<Integer> set = new LinkedHashSet<>();
		for(int e : arr) {
			set.add(e);
		}
		int longStreak = 0;
		for(int c : set) {
			if(!set.contains(c-1)) {//new number
				int currentstreak = 1;
				int currentNum = c;
				
				while(set.contains(currentNum+1)) {
					currentstreak++;
					currentNum++;
				}
				
				longStreak = Math.max(currentstreak, longStreak);
			}
		}
		return longStreak;
	}

}
