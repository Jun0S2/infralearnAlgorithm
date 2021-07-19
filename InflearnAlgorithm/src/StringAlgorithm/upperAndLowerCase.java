package StringAlgorithm;

import java.util.Scanner;

/**
 * Date: 07/19/2021
 * Author: June Park
 * Successful
 * */
public class upperAndLowerCase {
/*Given: line 1> String input (ex:StuDY)
 *Output: reverse the Caps (ex:sTUdy(
 * */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String before = sc.nextLine();
	//call non static method:
	upperAndLowerCase call = new upperAndLowerCase();
	System.out.println(call.reverseCaps(before));
	}
	
	public String reverseCaps(String s) {
		//store it in char array
		char[] arr1 = s.toCharArray();
		String result ="";
		//for each loop
		for(char element:arr1) {
			if(Character.isUpperCase(element)) {
				result+= Character.toLowerCase(element);
			}
			else if (Character.isLowerCase(element)) {
				result+= Character.toUpperCase(element);
			}
		}
		
		return result;
	}

}
