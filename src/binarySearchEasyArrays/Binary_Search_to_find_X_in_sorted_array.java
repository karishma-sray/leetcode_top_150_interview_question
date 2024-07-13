package binarySearchEasyArrays;

public class Binary_Search_to_find_X_in_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,3,5,9,12}; int target =12,high = nums.length, low = 0;
		int bs = binarySearch(nums,target,low,high);
		if(bs == -1) {
			System.out.println(target + " is not present in array");
		} else {
			System.out.println(target+ " got in "+ bs + " index");
		}
	}

	public static int binarySearch(int[] nums, int target, int low, int high) {
		if(low >=high) {
		return -1;
		}
		int mid = (high+low)/2;
		if(target == nums[mid]) {
			return mid;
		} else if(target>nums[mid]) {
			low = mid+1;
		return binarySearch(nums,target,low,high);
		} else {
			high = mid-1;
		return binarySearch(nums,target,low,high);
		}
	}

}
