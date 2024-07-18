/*Q1. Write a java program to calculate sum of 2 numbers.
Q2. Write a java program to find addition, subtraction, multiplication and
division.
Q3. Write a java program to swap 2 numbers.
Q4. Write a java program to swap 2 numbers without using temporary
variable.
Q5. Write a program in java to calculate area of circle.
*/

package week1_Assignment;

public class Assignment2 {

	public static void main(String[] args) {
		Q5();
	}
	public static void Q1() {
		int a = 2, b = 3, c = a+b;
		System.out.println("sum :"+ c);
	}
	public static void Q2() {
		int a = 2, b = 3, mul = a*b, sum = a+b, sub = b-a;
		System.out.println(" mul:" + mul + " sum : " +sum+ " sub : " +sub);
	}
	public static void Q3() {
		int a = 3, b = 4, temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a = " +a+ " b = "+b);
	}
	public static void Q4() {
		int a = 2, b = 3;
		a = a+b;
		b = a -b;
		a = a - b;
		System.out.println(a +" " + b);
	}
	public static void Q5() {
		int r = 3;
		System.out.println(3.14 *r*r);
	}
}
