package basic_Maths_Logic_Buildup;

public class Find_even_words_of_string {

	public static void main(String[] args) {
		String str = "sky is blue and vast";
		checkEvenWords(str);
	}

	public static void checkEvenWords(String str) {
		String[] strArr = str.split(" ");
		for(String s : strArr) {
			if(s.length() % 2 == 0) {
				System.out.println(s + " is an even word");
			}
		}
	}

}
