package basic_Maths_Logic_Buildup;

public class Reverse_a_number {

	public static void main(String[] args) {
		int n = -1234;
		System.out.println(reverse(n));

	}

	public static int reverse(int n) {
		// TODO Auto-generated method stub
		int rev = 0;
		int sign = (n < 0) ? -1 : 1;
		 n = Math.abs(n);
		
		while(n > 0) {
			int rem = n%10;
			//to check the surplus value of rev: it shouldn't be more than max no. : 2,147,483,647
			if(rev > (Integer.MAX_VALUE - rem)/10) {
				return 0;
			}
			
			rev = rev*10 + rem;
			n = n/10;
		}
		return sign*rev;
	}

}
