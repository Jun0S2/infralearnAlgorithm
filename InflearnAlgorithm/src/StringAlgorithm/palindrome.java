package StringAlgorithm;
/**
 * Date: 07/20/2021
 * Author: June Park
 * Successful
 * I'm sure there's easier function that twopointers
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		palindrome p = new palindrome();
		System.out.println(p.translate(p.isPalindrome(input)));
	}
	
	public boolean isPalindrome(String input) {
		//two pointers:
		boolean result = true;
		char[] arr1 = (input.toUpperCase()).toCharArray();
		int end = arr1.length-1;
		for (int i =0; i <arr1.length;i++) {
			if(arr1[i]!=arr1[end]) {
				result = false;
				end --;
			}
			else {end --;}
		}
		return result;
	}
	
	public String translate(boolean result) {
		if(result == true) {return "YES";}
		else {return "NO";}
	}

}
