//. Write a program in java to enter an array of size n. Display these elements in reverse order.

package week3;

import java.util.Scanner;

public class Assignment1_P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases : ");
		int t = sc.nextInt();
		while(t > 0) {
			System.out.println("Enter the no of ele in array: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				System.out.println("enter the elements: ");
				 arr[i] = sc.nextInt();
			}
			//print of an array in reverse order
			System.out.print("[");
			for(int i = n-1; i >= 0; i--) {
				System.out.print(arr[i] + "  ");
			}
			System.out.print("]");
			t--;
		}
	}
}
