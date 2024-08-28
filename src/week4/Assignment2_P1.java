package week4;
/*1. Write a program in java to input a sentence and decode the given string
by shifting each character of a string the number of times as specified by
user.
Example
Sample Input: s = GOOD BOY Shift Value = 3
Sample Output: JRRG ERB*/
public class Assignment2_P1 {

	public static void main(String[] args) {
		String str = "GOOD BOY";
		int shiftVal = 3;
		String strNew = "";
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				c =  (char) (c+shiftVal);
				strNew+=c;
			} else {
				strNew+=c;
			}
		}
		System.out.println(strNew);

	}

}
