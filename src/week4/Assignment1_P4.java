package week4;
//Write a program in java to print even length words.
public class Assignment1_P4 {

	public static void main(String[] args) {
		String str = "Hi my name is Nilay";
		String[] words = str.split(" ");
		for(String s : words) {
			if(s.length() % 2 == 0) {
				System.out.print(s+" ");
			}
		}
	}

}
