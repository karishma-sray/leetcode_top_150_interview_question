package array_String;

public class Rotate_Array_Left_Kth_Times {
	public static void main(String[] args) {
		int[] nums = {9, 8, 7, 6, 4, 2, 1, 3}; int k = 3;
		//{6, 4, 2, 1, 3, 9, 8, 7}
		rotateArrO(nums, k);
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
	public static void rotateArrO(int[] nums, int k) {
		/*Optimal solution with out taking any extra
		space within same array by using Reverse Algo*/
		int n = nums.length;
		 k = k%n;
		//1st reverse kth ele of array ie;{9,8,7} -> {7,8,9}
		//2nd reverse rest of the ele in array, ie;{6,4,2,1,3} --> {3,1,2,4,6}
		//3rd now reverse the complete array, ie; {7,8,9,6,4,2,1,3} --> {3,1,2,4,6,9,8,7}
		
		reverse(nums, 0,k-1);
		reverse(nums, k, n-1);
		reverse(nums, 0, n-1);
		
	}
	public static void reverse(int[] nums, int start,int end) {
		while(start < end) {
			//swap
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
