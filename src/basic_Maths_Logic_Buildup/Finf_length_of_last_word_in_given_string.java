package basic_Maths_Logic_Buildup;

public class Finf_length_of_last_word_in_given_string {

	public static void main(String[] args) {

		String str = "hi hello holly molly peanut";
		Finf_length_of_last_word_in_given_string fls = new Finf_length_of_last_word_in_given_string();
		int lastWordCount = fls.lastWordCount(str);
		System.out.println(lastWordCount);

	}

	public  int lastWordCountInbuilt(String str) {
		//by using inbuilt method
		str = str.trim();
		int n = str.length();
		 int lastStr = n- str.lastIndexOf(' ') - 1;
		return lastStr;
	}
	public  int lastWordCount(String str) {
		//no inbuilt method
		boolean charFound = false;
		int count = 0, n = str.length();
		for(int i =n-1; i >=0; i--) {
			if(str.charAt(i) != ' ') {
				charFound = true;
				count++;
			} else if(charFound){
				//break  When we encounter a space after finding a word
				break;
			}
		}
		
		return count;
	}
}
