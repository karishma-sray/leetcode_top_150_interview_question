//Write a program in java to store 5 numbers in an array. Create another
//array to contain squared values of all the elements of the first array.

package week3;

import java.util.Scanner;

public class Assignment2_P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i;
		for(i =0; i < n; i++) {
			 
			System.out.print("enter elements: ");
			arr[i] = sc.nextInt();
		}
		//print
		System.out.println("Input Array: ");
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] +" ");
		}
		int[]sqArr = new int[n];
		for(i = 0; i < n; i++) {
			sqArr[i] = arr[i] * arr[i];
		}
		// print
		System.out.println();
		System.out.println("Output Array: ");
		for (i = 0; i < n; i++) {
			System.out.print(sqArr[i] + " ");
		}
	}

}
