package StringAlgorithm;

import java.util.Scanner;

/**Author: June Park
 * Date : 7/20/2021
 * successful
 * */
public class removeDuplicates {
/* Given: I/p>> line in small caps
 * Output:	 >> remove duplicate chars
 * 
 * */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input =sc.next();
	//call non-static method:
	removeDuplicates ref = new removeDuplicates();
	System.out.println(ref.removeDups(input));
	}
	public String removeDups(String input) {
		char[] arr1 = input.toCharArray();
		String result="";
		//iterate through string and store only if there is no previously store same char
		for(char x : arr1) {
			if(!result.contains(Character.toString(x))) {
				result+=x;
			}
		}
		return result;
	}
	

}

