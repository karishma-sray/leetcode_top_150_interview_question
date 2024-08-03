package array_String;

public class Left_Rotation {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		leftRotate(nums);
		//print
		for(int i = 0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}
	public static void leftRotate(int[] nums) {
		
		int n = nums.length;
		//store the 1st element in temporary var
		int temp = nums[0];
		//traverse the array & do 1 left shift to rest of the elements
		for(int i = 1; i < n; i++) {
			nums[i-1] = nums[i];
		}
		//Now store the stored element in temp in end element of an array
		nums[n-1] = temp;
		
	}

}
