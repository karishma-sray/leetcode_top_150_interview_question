package binarySearchEasyArrays;

public class Search_Insert_Position {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 }; //{3, 4, 4, 7, 8 ,10};
		int target = 17;
		System.out.println("inserted index shoud be: "+ binarySearchInsert(nums,target));

	}

	public static int binarySearchInsert(int[] nums, int target) {
		int n = nums.length;
		int low = 0;
		int high = n-1;
		while(low <= high) {
			int mid = low+(high-low)/2;
			if(target == nums[mid]) {
				return mid;
			}else if(target > nums[mid]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return low;
	}

}
