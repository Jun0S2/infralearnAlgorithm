package StringAlgorithm;

import java.util.Scanner;

/**Date: 07/20/2021
 * Author: June Park
 * runs fine and returns correct result, however, 
 * susccess
 * */
public class getNum {
	/*Only read number from the input*/
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	getNum n = new getNum();
	//n.get(input);
	System.out.print(n.removeZeroStart(n.get(input)));
	
}
public String get(String input) {
	//number values in ascii: ASCII value of digits [0 – 9] ranges from [48 – 57]
	//change string to char array
	char[] checkByAscii=input.toCharArray();
	String result="";
	for(char x : checkByAscii) {
		result += (x>=48 && x<=57) ? x:"";
		
	}
	
	return result;
}
public int removeZeroStart(String a) {
	String result = "";
	if(a.charAt(0)=='0') {
		result = a.substring(1);
	}
	else{result = a;}
	int re = Integer.parseInt(result);
	return re;
}
}
