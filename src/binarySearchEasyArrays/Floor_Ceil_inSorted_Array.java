package binarySearchEasyArrays;

public class Floor_Ceil_inSorted_Array {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 }; //{3, 4, 4, 7, 8 ,10};
		int target = 22;
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
		if(floorvalue == -1){
			return floorvalue;
		}else{
			return nums[floorvalue];
		}
		
	}

	public static int binarySearch_findCeil(int[] nums, int target) {
		int low = 0, high = (nums.length) - 1, ceilvalue = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				ceilvalue= mid;
				break;
			} else if (target < nums[mid]) {
				ceilvalue = mid;//if going left then update the ceil value
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		if(ceilvalue == -1){
			return ceilvalue;
		}else{
			return nums[ceilvalue];
		}
		
	}

	}


