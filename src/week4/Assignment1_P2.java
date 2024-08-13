package week4;

public class Assignment1_P2 {
/*Write a program in java to convert lowercase characters to uppercase
characters and vice versa in a string.
*/
	public static void main(String[] args) {
		String str = "HeLlO";
		String nstr ="";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z') {
				nstr += (char)(c-32); //upercase
			} else if (c >= 'A' && c <= 'Z') {
				nstr += (char)(c+32);//lowercase
			} else {
				nstr+=c;
			}
		}
		System.out.println(nstr);

	}

}
