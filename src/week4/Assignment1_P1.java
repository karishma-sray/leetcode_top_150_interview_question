package week4;
//Write a program in java to find length of last word in a string.
public class Assignment1_P1 {

	public static void main(String[] args) {
		String str = "cchgcyjf hgkuyg bhgyt";
		int count = 0;
		for(int i = str.length()-1; i >=0; i--) {
			if(str.charAt(i) == ' ') {
				break;
			}
			count++;
		}
		System.out.println(count);
	}

}
