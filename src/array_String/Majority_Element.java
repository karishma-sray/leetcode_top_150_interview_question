package array_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Majority_Element {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 2, 2, 3 };
		int x = majorityElement3(nums);
		System.out.println(x);
	}

	public static int majorityElement1(int[] nums) {
		// brute force solution TC: O(N^2)
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count > n / 2) {
				return nums[i];
			}
		}
		return -1;
	}
	public static int majorityElement2(int[] nums) {
		//better solution TC-> O(N LogN) + O(N), but taking extra space ie; O(N)
		//as we'r using ordered map so its tc = logN, in case of un sorted map it's no log N
		int n = nums.length;
		HashMap<Integer,Integer> map = new HashMap<>();
		//iterate &store all the numbers as key & it's occurrences in value
		for(int i = 0; i < n; i++) {			
			int val = map.getOrDefault(nums[i], 0);//fetch val of each key
			map.put(nums[i], val + 1);//store the key & val			
		}
		for(Entry<Integer, Integer> key : map.entrySet()) {
			if(key.getValue() > n/2) {
				return key.getKey();
			}
		}
		return -1;
	}
	public static int majorityElement3(int[] nums) {
		int n = nums.length;
		int count = 0;
		int ele = 0;
		for(int i = 0; i < n; i++) {
			if(count == 0) {
				ele = nums[i];
				count = 1;
			} else if(ele == nums[i]) {
				count++;
			} else {
				count--;
			}
		}
		//check if stored element is majority ele or not
		int temp = 0;
		for(int i = 0; i < n; i++) {
			if(ele == nums[i]) {
				temp++;
			}
			if(temp > n/2) {
				return ele;
			}
		}
		return -1;
	}
}
