package ArrayAlgorithm;

import java.util.Scanner;

/**Date:07/22/2021
 * Author June Park
 * Fibonacci
 * */
public class Fibonacci {
	
	public static void main(String[] args) {
		//get input
		Scanner sc = new Scanner (System.in);
		int length = sc.nextInt();
		/*Logic: a[0] and a[1] is always 1, also, a[2]=a[0]+a[1] and it applies to all the others
		 * thus, the formula i used is a[i]=a[i-2]+a[i-1]*/
		int[] fib = new int[length];
		fib[0] =1;
		fib[1] =1;
		for(int i =2; i<length; i++) {fib[i]=fib[i-1]+fib[i-2];}
		//Test:
		for(int x : fib) {System.out.print(x+" ");}
		
	}
	

}
