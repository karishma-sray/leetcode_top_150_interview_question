package binarySearchEasyArrays;

public class Find_the_Nth_root_of_a_number_using_binary_search {

	public static void main(String[] args) {
		int n = 4, x = 81;
		int rootOver = findSqrRootBinarySearch(n,x);
		System.out.println(rootOver);
	}

	public static int findRootOfnum(int n, int x) {
		// brute force--> by using linear search
		//TC = O(NX)
		for (int i = 1; i <= x; i++) {
			if (findPower(n, i) == x) {
				return i;
			} else if (findPower(n, i) > x) {
				break;
			}
		}
		return -1;
	}
	public static int findSqrRootBinarySearch(int n, int x) {
		//optimize: Binary search
		//TC-> O(N log X)
		int low = 1, high = x;
		while(low <= high) {
			int mid = low+(high-low)/2;
			if(findPower(n,mid) == x) {
				return mid;
			} else if(findPower(n,mid) > x) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return -1;
	}
	public static int findPower(int n, int x) {
		int ans = 1;
		for(int i = 1; i <=n; i++) {
			ans = ans*x;
		}
		return ans;
	}
}
