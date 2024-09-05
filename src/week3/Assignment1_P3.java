//Write a program in java to find sum of odd and even elements in an array
package week3;
import java.util.Scanner;
public class Assignment1_P3 {

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
			sumOfEvenOddNumOfArray(arr);
			t--;
		}
	}

	public static void sumOfEvenOddNumOfArray(int[] arr) {
		int n = arr.length;
		int sumeven = 0, sumodd = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i]%2 == 0) {
				sumeven += arr[i];
			}else {
				sumodd += arr[i];
			}
		}
		System.out.println("Sum of Even no. of Array : "+ sumeven + " sume of odd no. of Array : " + sumodd);
	}

}
