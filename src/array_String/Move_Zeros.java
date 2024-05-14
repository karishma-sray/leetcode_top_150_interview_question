/*283. Move Zeroes
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done?
*/
package array_String;

public class Move_Zeros {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		Move_Zeros mz = new Move_Zeros();
		mz.moveZeroes(nums);
		//print
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}
	 public void moveZeroes(int[] nums) {
	        int j = -1;
	        int n = nums.length;
	        for (int i = 0; i < n; i++) {
	            if (nums[i] == 0) {
	                j = i;
	                break;
	            }
	        }
	        if (j == -1) {
	            return;
	        }
	        for (int i = j + 1; i < n; i++) {
	            if (nums[i] != 0 && nums[j] == 0) {
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	                j++;
	            }
	        }
	    }
}
