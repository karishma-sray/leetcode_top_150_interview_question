package array_String;

public class Rotate_Array {
	public static void main(String[] args) {
		int[] nums = {9, 8, 7, 6, 4, 2, 1, 3}; int k = 2;
		rotateArr(nums, k);
		//print
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] +" ");
		}
	}
	public static void rotateArr(int[] nums, int k) {
		int n = nums.length;
		k = k%n;
		
		for(int i = 0; i < k; i++) {
			int lastEle = nums[n-1];
			for(int j = n-1; j > 0; j--) {
				nums[j] = nums[j-1];
			}
			nums[0] = lastEle;
		}
	}
}
