package basic_Maths_Logic_Buildup;

public class Even_and_OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123456;
		checkEvenandOdd(n);
		checkEvenandOddWithoutAirmatic(n);
	}

	public static void checkEvenandOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("checkEven&Odd : even");
		} else {
			System.out.println("checkEven&Odd : odd");
		}
	}
	
	public static void checkEvenandOddWithoutAirmatic(int n) {
		if( (n&1) == 1) {
			System.out.println("checkEvenandOddWithoutAirmatic : odd");
		} else {
			System.out.println("checkEvenandOddWithoutAirmatic : even");
		}
	}

}
