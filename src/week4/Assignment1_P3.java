package week4;
/*Write a program in java to reverse words in string.
Example
Sample Input: Hi my name is Nilay
Sample Output: Nilay is name my Hi*/
public class Assignment1_P3 {

	public static void main(String[] args) {
		String str = "Hi my name is Nilay";
		
		reverseString(str);
	}

	public static void reverseString(String str) {
		String strRev = "";
		String[] word = str.split(" ");// Split the input string into words
		for(int i = word.length -1; i >=0 ;i--) {
			strRev+= word[i];
			if(i != 0) {
				strRev+=" ";
			}
		}
		System.out.println(strRev);
	}

}
