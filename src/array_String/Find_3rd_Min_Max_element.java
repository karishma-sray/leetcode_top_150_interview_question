package array_String;

public class Find_3rd_Min_Max_element {

	public static void main(String[] args) {
		int[] arr = { 21, 30, 32, 60, 6, 5 };
		int third_Max_Element = findThirdMaxElement(arr);
		System.out.println(third_Max_Element);

		int third_Min_Element = findThirdMinElement(arr);
		System.out.println(third_Min_Element);

	}

	public static int findThirdMinElement(int[] arr) {
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		int tmin = Integer.MAX_VALUE;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				tmin = smin;
				smin = min;
				min = arr[i];
			} else if (arr[i] < smin && arr[i] != min) {
				tmin = smin;
				smin = arr[i];
			} else if (arr[i] < tmin && arr[i] != smin) {
				tmin = arr[i];
			}
		}
		return tmin == Integer.MAX_VALUE ? min : tmin;

	}

	public static int findThirdMaxElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		int tmax = Integer.MIN_VALUE;

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				tmax = smax;
				smax = max;
				max = arr[i];
			} else if (arr[i] > smax && arr[i] != max) {
				tmax = smax;
				smax = arr[i];
			} else if (arr[i] > tmax && arr[i] != smax) {
				tmax = arr[i];
			}
		}
		return tmax == Integer.MIN_VALUE ? max : tmax;
	}

}
