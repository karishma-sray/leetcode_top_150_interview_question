//Write a program in java to enter two arrays of size n, multiply both
//array and store result in the third array
package week3;

import java.util.Scanner;

public class Assignment2_P2 {

	public static void main(String[] args) {
		//array1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arrMul = new int[n];
		int i;
		for(i =0; i < n; i++) {			 
			System.out.print("enter elements: ");
			arr1[i] = sc.nextInt();
		}
		for(i =0; i < n; i++) {			 
			System.out.print("enter elements: ");
			arr2[i] = sc.nextInt();
		}
		System.out.println();
		//print
		System.out.println("Input Array1 : ");
		for(i = 0; i < n; i++) {
			System.out.print(arr1[i] +" ");
		}
		System.out.println();
		System.out.println("Input Array2 : ");
		for(i = 0; i < n; i++) {
			System.out.print(arr2[i] +" ");
		}
		System.out.println();
		System.out.println("Multiplication of both arrays: ");
		for(i = 0; i < n; i++) {
			arrMul[i] = arr1[i]*arr2[i];
		}
		System.out.println();
		System.out.println("Input Array2 : ");
		for(i = 0; i < n; i++) {
			System.out.print(arrMul[i] +" ");
		}
	}

}
