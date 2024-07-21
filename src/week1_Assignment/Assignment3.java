/*Q1. Write a java program to calculate sum of 2 decimal numbers.
Q2. Write a java program to find volume of sphere.
Q3. Write a java program to convert Fahrenheit to centigrade.
Q4. Write a java program to input centimetre then convert to meter and
centimetre.
Q5. Write a program in java to input a minute then convert to an hour and
minute*/
package week1_Assignment;

public class Assignment3 {

	public static void main(String[] args) {
		Q5();
	}
	public static void Q1() {
		double a = 3.4 , b = 6.6, sum = a+b;
		System.out.println(sum);
		
	}
	public static void Q2() {
		int a = 2, b = 3, c = 4;
		System.out.println("sphere: "+ a*b*c);
	}
	public static void Q3() {
		double Fahrenheit = 32.78;
		double Celsius = (Fahrenheit - 32) * 5 / 9;
		System.out.println(Celsius);
	}
	public static void Q4() {
		int centimeters = 6780;
		int meters = centimeters / 100;
		int remainingCentimeters = centimeters % 100;
		System.out.println(meters + " m & " + remainingCentimeters + " cm");

	}
	public static void Q5() {
		int minute = 650;
		int hour = minute/60;
		int remMinute = minute % 60;
		System.out.println(hour + " Hr & " + remMinute + " min");
	}
}
