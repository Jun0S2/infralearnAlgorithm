package StringAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**Date: 07/19/2021
 * Author: June Park
 * */
public class reverseString {
/*Condition: USE STRING BUFFER
 *Given : line1 >> number of lines
 *line 2~ input1>> string inputs
 *Output: reversed String
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		String[] store = new String[numbers];
		for(int i =0; i<numbers;i++) {
			store[i] = sc.next();
		}
		//call non static method;
		reverseString ref = new reverseString();
		ArrayList<String> result = ref.returnReversedString(numbers, store);
		
		for(String element: result)
		System.out.println(element);
	}
	
	public ArrayList<String> returnReversedString(int numbers, String[] input){
		//Declare String Array List...which I totally forgot lol
		ArrayList<String> reversed = new ArrayList<>();
		//use for each loop: element in the input
		for(String element : input) {
			//In string buffer, there is a function to reverse the string
			String temp = new StringBuilder(element).reverse().toString();
			//add to list
			reversed.add(temp);
		}
		return reversed;
		
	}

}
