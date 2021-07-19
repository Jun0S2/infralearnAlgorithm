package StringAlgorithm;

import java.util.Scanner;

/**Date: 07/19/2021
 * author: June Park
 * */
public class longestWord {
	/*Given : line 1 >> input any string 
	 *Output: return longest word which will be string. 
	 *if the length is same return the formal one
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//call nonstatic method
		longestWord ref = new longestWord();
		System.out.println(ref.compare(input));
	}
	public String compare(String in) {
		//split the string and store it in array
		String[] words = in.split(" ");
		int max = 0;
		int index = 0;
		for(int i =0; i<words.length;i++) {
			if(max<words[i].length()) {
				//longest length
				max = words[i].length();
				index = i;}
		}
		return words[index];
		
	
	}
}
