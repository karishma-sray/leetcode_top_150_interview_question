/*Count Digits
Difficulty: EasyAccuracy: 30.45%Submissions: 191K+Points: 2
Given a number N. Count the number of digits in N which evenly divide N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
 

Example 1:

Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly
Example 2:

Input:
N = 23
Output
0
Explanation:
2 and 3, none of them
divide 23 evenly

Your Task:
You don't need to read input or print anything. Your task is to complete the function evenlyDivides() which takes an integer N as input parameters and returns an integer, total number factor of digits N which divides N evenly.


Expected Time Complexity: O(log N)
Expected Space Complexity: O(1)
 

Constraints:
1<=N<=10^5*/

package basic_Maths_Logic_Buildup;

public class Count_Digits {

	public static void main(String[] args) {
		int N = 2446;
		System.out.println(evenlyDivides(N));
	}

	static int evenlyDivides(int N) {
		// code here
		int n = N;
		int count = 0;
		
		while(N > 0) {
			int lastdigit = N%10;
			if(lastdigit >0) {
				if(n%lastdigit == 0) {
					count++;
				}
			}
			N = N/10;
		}
		return count;
		
	}
}



