package array_String;
import java.util.Scanner;
public class Find_2nd_Largest_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements in Array : ");
		int i;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(i = 0; i< n; i++) {
			System.out.println("Enter the element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Input Array: ");
		//print
		System.out.print("[");
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		int ans =findSecondMaxElement(arr);
		System.out.println("2nd largest element is:  "+ ans);
	}

	public static int findSecondMaxElement(int[] arr) {
		//find both max & 2nd max elements
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if(arr[i] > secondMax && arr[i] != max){
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

}
