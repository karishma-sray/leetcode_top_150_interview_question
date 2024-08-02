package basic_Maths_Logic_Buildup;

public class Check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 120321;
		System.out.println(isPalindrome(x));
	}
	public static boolean isPalindrome(int x) {
		int rev = 0;
		int temp = x;
		while(temp > 0) {
			int rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		return (rev == x);
	}
}
