package StringAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;
/**Date: 07/19/2021 -> 08/06
 * Author: June Park
 * Problem #05
 * */
import java.util.Stack;
public class reverseOnlyChar {
/*Reverse only Characters and leave special characters
 *ex:a#b!ES ->SE#b!a 
 *Will Use Stack to solve this problemo
 * */
	
	static Stack<Character> tempStorageForChars = new Stack<Character>();
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String original = sc.next();
	System.out.println(translate(extractChars(original)));
	
	}
	
	private static char[] extractChars(String line) {
		char[] translated = new char[line.length()];
		for(int i =0; i<line.length();i++) {
			char c =line.charAt(i);
			//if alphabets -> put '0' temporarily and put the alphabet in waitingStack
			if((c>=97&& c<=122)||(c>=65&&c<=90)) {
				tempStorageForChars.push(c);
				translated[i]='0';
			}
			//special Character: put it back there..
			else {translated[i]= c;}
		}
		return translated;
	}
	private static char[] translate(char[] putAlphabetsinZero) {
		for(int i =0; i<putAlphabetsinZero.length;i++) {
			//if its a place we marked, put the top alphabets in waiting stack to reverse alphabets
			if(putAlphabetsinZero[i]=='0') {
				putAlphabetsinZero[i]= tempStorageForChars.pop();
			}
		}
		return putAlphabetsinZero;
	}
	

	

}
