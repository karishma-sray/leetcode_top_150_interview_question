
//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
package binarySearchEasyArrays;

public class Implement_Lower_Upper_Bound {

	public static void main(String[] args) {
		int[] nums = {3, 4, 4, 7, 8 ,10}; //{ -1, 0, 3, 5, 9, 12 };
		int target = 8;
		int findFloor = binarySearch_findFloor(nums, target);
		int findCeil = binarySearch_findCeil(nums, target);
		System.out.println(findFloor+ " & "+findCeil);
	}

	public static int binarySearch_findFloor(int[] nums, int target) {
		int low = 0, high = (nums.length) - 1, floorvalue = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				floorvalue = mid;
				break;
			} else if (target < nums[mid]) {
				high = mid - 1;
			} else {
				// update the floorvalue if it'll go to right side only
				floorvalue = mid;
				low = mid + 1;
			}
		}
		return nums[floorvalue];
	}

	public static int binarySearch_findCeil(int[] nums, int target) {
		int low = 0, high = (nums.length) - 1, ceilvalue = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				ceilvalue= mid;
				
			} else if (target < nums[mid]) {
				ceilvalue = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return nums[ceilvalue];
	}

}
