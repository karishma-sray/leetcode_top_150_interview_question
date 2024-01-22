package array_String;

public class Right_Rotation {
//Right rotation by 1 
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		rightRotation(nums);
		//print
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

	public static void rightRotation(int[] nums) {
		int n = nums.length;
		int temp = nums[n-1];
		for(int i = n-1; i > 0; i--) {
			nums[i] = nums[i-1];
			n--;
		}
		nums[0] = temp;
	}

}
