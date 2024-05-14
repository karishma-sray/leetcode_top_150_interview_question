/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
*/




package array_String;

public class Sort_Of_Colors_Dutch_Flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,0,1,2};
		int[] res = sortColors(arr);
		System.out.println("After sorting");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	
	
	    public static void swap(int[] nums, int a, int b){
	        int temp = nums[a];
	        nums[a] = nums[b];
	        nums[b] = temp;
	        
	    }
	    public static int[] sortColors(int[] nums) {
	        int n = nums.length;
	        int l =0;
	        int m = 0;
	        int h = n-1;
	        while(m <= h)
	        {
	            if(nums[m] == 0)
	            {
	                swap(nums, m, l);
	                m++;
	                l++;
	            }
	            if(m <= h && nums[m] == 1)
	            {
	                m++;
	            }
	            
	            if(m <= h && nums[m] == 2)
	            {
	                swap(nums, m, h);
	                h--;
	            }
	        }
			return nums;
	    }
	    
	}

