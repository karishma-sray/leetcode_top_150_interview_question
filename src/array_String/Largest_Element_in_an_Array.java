package array_String;

public class Largest_Element_in_an_Array {

	public static void main(String[] args) {
		int[] arr = {1,8 ,7 ,56, 90};
		System.out.println(largest(arr));

	}

	public static int largest(int[] arr) {
		int max = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
