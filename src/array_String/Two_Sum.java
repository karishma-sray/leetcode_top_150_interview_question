package array_String;

public class Two_Sum {

	public static void main(String[] args) {
		int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum_Brute_Force(arr, target);
        for(int i = 0; i<ans.length;i++) {
        	System.out.print(ans[i]+" ");
        }
       
	}
	public static int[] twoSum_Brute_Force(int[] nums, int target) {
		
		int n = nums.length;
		int[]ans = new int[2];
		for(int i = 0; i< n;i++) {
			for(int j = i+1; j <n;j++) {
				if(nums[i] + nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
				}
			}
		}
				
		return ans;
        
    }

	public static int[] twoSum_Better(int[] nums, int target) {
		
		return nums;
		
	}
}
