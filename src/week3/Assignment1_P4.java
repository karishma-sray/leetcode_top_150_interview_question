//Write a program in java to average of n numbers using an array.

package week3;

import java.util.Scanner;

public class Assignment1_P4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases you want to execute: ");
		int t = sc.nextInt();
		while( t > 0) {
			System.out.println("Enter the number of elements for array: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			int i;
			for(i = 0; i<n; i++) {
				System.out.println("Enter the element : ");
				arr[i] = sc.nextInt();
			}
			
			//print
			System.out.println(" Input Array :  ");
			System.out.print("[");
			for(i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("]");
			System.out.println();
			findAvgOfArray(arr,n);
			t--;
		}
	
	}

	public static void findAvgOfArray(int[] arr, int n) {
		int avg,sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += arr[i];
		}
		avg = sum/n;
		System.out.println("Avg of Array : "+ avg);
	}

}
