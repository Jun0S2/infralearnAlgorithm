import java.util.Scanner;
import java.util.Stack;

public class Main {
static Stack<Character> palCheck = new Stack<Character>();
static Stack<Character> compare = new Stack<Character> ();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String input = sc.nextLine();
		pushStack(input);
		compare();
		String r = isPal()==true ? "YES": "NO";
		System.out.printf("%s", r);

	}
	private static void pushStack(String line) {
		char[] translated = line.toCharArray();
	//	System.out.println("with special character: "+translated.length);
		for(int i =0; i<translated.length;i++) {
			char c = translated[i];
			//if alphabets -> put '0' temporarily and put the alphabet in waitingStack
			if((c>=97&& c<=122)||(c>=65&&c<=90)) {
				if (c>=97&&c<=122) {c=(char) (c-32);}
				palCheck.push(c);
			}
			else {continue;}
		}
//		System.out.println(palCheck);
		
	}
	private static void compare() {
	//put half in another stack and compare
//		System.out.println("Without special characters: "+palCheck.size());
		int half = (palCheck.size()-1)/2;
		//짝수일때:
		if(palCheck.size()%2 ==0) {
			for(int i =0; i<=half; i++){
				compare.push(palCheck.pop());
			}
		}
		//홀수면?
		else {
			for(int i =0; i<half; i++){
				compare.push(palCheck.pop());
				//반으로 나눴을때 하나 남게되는데 얜 걍 버려 ㅋ
				if(i==half-1) {palCheck.pop();}
			
			}
		}
//		System.out.println(palCheck);
//		System.out.println(compare);
		
	}
	
	private static boolean isPal() {
		boolean flag = true;
		for(int i =0; i<palCheck.size(); i++) {
			if(palCheck.pop()==compare.pop()) {flag = true;}
			else {flag= false;return false;}
		}
		return flag;
	}
	
}
