package sortings;

public class Selection {

	public static void main(String[] args) {
		int[] arr = {2,9,3,1,5};
		
		selectionSort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			int minVal = arr[i];
			int minIndex = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr[j] < minVal) {
					minVal = arr[j];
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
