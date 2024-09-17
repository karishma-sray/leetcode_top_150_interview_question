package array_String;
public class Find_SumOf_1st_and_Last_2nd_and_2ndLast_and_so_on {

	public static void main(String[] args) {
		int[] num = {5,6,3,5,2,7};
		int[] ans = findAlternateSum(num);
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] findAlternateSum(int[] num) {
		//n = length of new array
		//m = length of input array
		//use the loop for upto half of an input array
		//if input array is odd then add the middle element into end of new array
		//time complexity :O(m), where m = length of input array
		int n;
		int m = num.length;
		if(m %2 == 0) {
			 n = m/2;
		} else {
			n = (m/2)+1;
		}
		int[] ans = new int[n];
		for(int i = 0; i < m/2; i++) {
			ans[i] = num[i] + num[m-i-1];
		}
		if(m%2 != 0) {
			ans[n - 1] = num[m/2];
		}
		return ans;
	}	

}
