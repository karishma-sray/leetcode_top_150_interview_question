package array_String;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Find_single_Duplicate_Number {

	public static void main(String[] args) {
		int[] num = {1,3,4,2,2};
		finddupsBruteForce(num);
		finddupsBetter(num);
		finddupsGood(num);
		finddupsBest(num);
	}

	public static void finddupsBruteForce(int[] arr) {
		//tc-> O(n^2) , sc-> O(1)
		int ans = 0;
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 1; j <n; j++) {
				if(arr[i] == arr[j]) {
					ans = arr[i];
				}
			}
		}
		System.out.println("finddupsBruteForce : "+ ans);
	}

	public static void finddupsBetter(int[] arr) {
		//tc-> O(n log n) + O(n), sc-> O(1)
		int ans = 0;
		int n = arr.length;
		Arrays.sort(arr);
		for(int i = 1; i < n; i++ ) {
			if(arr[i-1] == arr[i]) {
				ans = arr[i];
			}
		}
		System.out.println("finddupsBetter : "+ ans);
	}
	
	public static void finddupsGood(int[] arr) {
		
		 Set<Integer> unique = new LinkedHashSet<>();
		 Set<Integer> dups = new LinkedHashSet<>();
		 
		 for(int e : arr) {
			 if(!unique.add(e)) {
				 dups.add(e);
			 } else {
				 unique.add(e);
			 }
		 }
		System.out.println("finddupsBetter : "+ dups);
	}

	public static void finddupsBest(int[] arr) {
		//Floyd cycle
		/*
		 * Explanation: Cycle Detection:
		 * 
		 * We use two pointers (slow and fast). slow moves one step at a time, while
		 * fast moves two steps. They meet inside the cycle (like detecting a loop in a
		 * linked list). Finding Duplicate (Cycle Start):
		 * 
		 * Reset slow to the start and move both slow and fast one step at a time. The
		 * meeting point is the duplicate number. Time & Space Complexity: Time
		 * Complexity: O(n) Space Complexity: O(1) (no extra space used) Would you like
		 * further optimizations or explanations?
		 */
		
		int slow = arr[0];
		int fast = arr[0];
		
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		}
		while(slow != fast);
		
		slow = arr[0];
		while(slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		 
		System.out.println("finddupsBest : "+slow);
	}
}
