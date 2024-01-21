package array_String;

public class Rotate_Array_Left_Kth_Times {
	public static void main(String[] args) {
		int[] nums = {9, 8, 7, 6, 4, 2, 1, 3}; int k = 3;
		//{6, 4, 2, 1, 3, 9, 8, 7}
		rotateArr(nums, k);
		//print
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] +" ");
		}
	}
	public static void rotateArr(int[] nums, int k) {
		//bruit force tc--> O(N+K), sc--> k extra space has been taken
		int n = nums.length;
		int[] temp = new int[k];
		
		// now store elements from 0 to kth
		for(int i = 0; i < k; i++) {
			temp[i] = nums[i];
		}
		//now shift the rest of elements to left from k to n-1
		for(int i = k; i < n; i++) {
			nums[i-k] = nums[i];
		}
		int j = 0;
		//now merge the temp[] at the end of nums[]
		for(int i = n-k; i < n; i++) {
			nums[i] = temp[j];
			//n++;
			j++;
		}
	}
}
