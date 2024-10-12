package array_String;

public class Reverse_String_II {

	public static void main(String[] args) {
		String str = "ab23cb";
        System.out.println("Original String: " + str);
        String result = reverseAlphabets(str);
        System.out.println("Reversed String: " + result);

	}

	private static String reverseAlphabets(String str) {
		int start = 0;
		int end = str.length()-1;
		char[] arr = str.toCharArray();
		while(start < end) {
			if(!Character.isLetter(arr[start])) {
				start++;
			} else if (!Character.isLetter(arr[end])) {
				end++;
			} else {
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		return new String(arr);
	}

}
