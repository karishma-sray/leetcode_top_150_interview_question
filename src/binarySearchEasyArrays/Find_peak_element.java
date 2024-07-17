package binarySearchEasyArrays;

public class Find_peak_element {

	public static void main(String[] args) {
		//Brute force : use linear search, TC: O(N)
		//Optimized: use Binary search in unsorted array, TC: O(logN)
		int[] nums = {1,2,1,3,5,6,4};
		int peakIndex = findPeak(nums);
		System.out.println(peakIndex);
	}

	public static int findPeak(int[] nums) {
		//case1--> check the both start & end element
		int n = nums.length;
		if(n == 1) {
			return 0;
		}
		if(nums[0] > nums[1]) {
			return 0;
		}
		if(nums[n-1] > nums[n-2]) {
			return n-1;
		}
		
		//case2--> once if there's no peak from case1, then check with rest of mid elements except both start & end
		int low = 1,high = n-2;		
		while(low <= high) {
			int mid = low+(high-low)/2;
			if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
				return mid;
			} else if(nums[mid] > nums[mid-1]) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return -1;
	}
}
