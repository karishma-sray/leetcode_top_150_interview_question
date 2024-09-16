package array_String;

import java.util.LinkedHashSet;
import java.util.Set;

public class Find_Duplicate_Numbers {

	public static void main(String[] args) {
		int[] num = {1,2,1,3,2,3,4,5,5};
		 findDuplicates(num);

	}

	private static void findDuplicates(int[] num) {
		
		Set<Integer> unique = new LinkedHashSet<>();
		Set<Integer> duplicate = new LinkedHashSet<>();
		for(int e : num) {
			if(!unique.add(e)) {
				duplicate.add(e);
			}
		}
		System.out.println("duplicate numbers : " + duplicate);
	}

}
