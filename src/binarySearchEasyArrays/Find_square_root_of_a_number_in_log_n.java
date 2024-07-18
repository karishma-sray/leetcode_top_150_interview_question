package binarySearchEasyArrays;

public class Find_square_root_of_a_number_in_log_n {

	public static void main(String[] args) {
		int x = 6;
		int sqrRoot = findSqrRootOptimize(x);
		System.out.println(sqrRoot);

	}

	public static int findSqrRoot(int x) {
		//brute force
		if(x == 0 || x == 1) return x;
		int result = 1;
		// Perform linear search from 1 to x/2
		for(int i = 1; i <= x/2;i++) {
			 // If i*i is less than or equal to x, update result
			if(i*i <= x) result = i;
			else break;
		}
		return result;
	}

	public static int findSqrRootOptimize(int x) {
		//brute force
		if(x == 0 || x == 1) return x;
		int result = 1;
		// Perform linear search from 1 to x/2
		int low = 1, high = x;
		while(low <= high) {
			int mid = low+(high - low)/2;
			if(mid*mid <= x) {
				result = mid;
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return result;
	}

}
