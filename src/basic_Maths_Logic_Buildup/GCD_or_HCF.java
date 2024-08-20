package basic_Maths_Logic_Buildup;

public class GCD_or_HCF {

	public static void main(String[] args) {
		Long A = 15L;
		Long B = 20L;
		Long[] result = lcmAndGcd(A, B);
		System.out.println("LCM: " + result[0] + ", GCD: " + result[1]);

	}
	public static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long gcd = findGCD(A, B);
        Long lcm = (A * B) / gcd;
        return new Long[]{lcm, gcd};
    }
    
    public static Long findGCD(Long a, Long b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
