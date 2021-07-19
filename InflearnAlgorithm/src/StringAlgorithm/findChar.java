package StringAlgorithm;

import java.util.Scanner;

/**
 * Date: 07/19/2021
 * Author: June Park
 * Successful
 * */
public class findChar {
	public static void main(String[] args) {
		/*Given: (ln 1) String
		 * 		 (ln 2) char
		 * Output:		number of char
		 * */
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	char find = sc.next().charAt(0);
	
	
	//call non-static method:
	//make reference: CLASSNAME VARNAME = NEW CLASSNAME();
	findChar ref = new findChar();
	System.out.println(ref.count(input, find));

	}
	
	public int count(String str, char c) {
		int count=0;
		//str to Char Array:toCharArray
		char[] arr = str.toUpperCase().toCharArray();
		//char uppercase: Character.toUpperCase();
		char c2= Character.toUpperCase(c);
		//foreach:for character x in array arr
		for(char x: arr) {
			//if x in arr is equal to c2
			if(x==c2) {count++;}
		}
		return count;
	}
}
