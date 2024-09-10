//Write a program in java to print sum of all odd indexes in an array.
package week3;

import java.util.Scanner;

public class Assignment1_P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the test cases you want to check: ");
		int t = sc.nextInt();
		while(t > 0) {
			System.out.println("Enter the no. of elements in an Array: ");
			int n = sc.nextInt();
			int i ;
			//take the array input
			int[] arr = new int[n];
			for(i = 0; i < n; i++) {
				System.out.println("Enter the elements: ");
				arr[i] = sc.nextInt();
				}
			//print the given array by user
			System.out.print("[");
			for(i = 0; i < n; i++) {
				System.out.print(arr[i] +" "); 
			}
			System.out.print("]");
			//find the odd no. sum
			int sumOddEle = sumOfOddElements(arr);
			System.out.println("sum of odd elements in an array : " + sumOddEle);
			t--;
		}
	}

	public static int sumOfOddElements(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for(int i = 0; i<n; i++) {
			if(i % 2 != 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

}
