/*Q1. Write a java program to print “Hello World”.
Q2. Write a java program to print name without using double quotes.
Q3. Write a java program to print name and surname in different lines.
Note: you can only use 1 print statement.
Q4. Write a java program to take user input using scanner class.
Q5. Write a program in java to print double quotes(“), single quotes(‘) and
backslash(/).*/


package week1_Assignment;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		Q5();
	}
	public static void Q1() {
		System.out.println("hello world");
	}
	public static void Q2() {
		char[] name = {'J','o','h','n'};
		for(char e:name) {
			System.out.print(e);
		}
	}
	public static void Q3() {
		System.out.print("john \nMax");
	}
	public static void Q4(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your data: ");
		String str1 = sc.nextLine();
		System.out.println(str1);
		sc.close();
	}
	public static void Q5() {
		System.out.println(" \' ");
		System.out.println(" \" ");
		System.out.println(" / ");
		
	}
}
