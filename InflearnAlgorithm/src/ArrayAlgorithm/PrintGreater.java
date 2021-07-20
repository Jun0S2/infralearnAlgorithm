package ArrayAlgorithm;
/**Date: 07/20/2021
 * Author: June Park
 * N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * */
import java.util.Arrays;
import java.util.Scanner;

public class PrintGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		for(int i =0; i <n; i++) {
			input [i] = sc.nextInt();
		}
		//System.out.println(Arrays.toString(input));
		PrintGreater p = new PrintGreater();
		int comp = p.target(n, input);
		p.printGreater(input, comp);
	}
	public void printGreater (int[] input, int compareWith) {
		String result ="";
		for(int x : input) {
			if(x>compareWith) {
				result+= x+ " ";
			}
			
		}
		System.out.println(result);
	}
	public int target(int n,int[] input) {
		int targetIndex=0;
		//for(int x: input) {if(x==n) {targetIndex=x-1;}  }
		for(int i =0; i<input.length;i++)
		{
			if(input[i]==n) {
				targetIndex=i-1;
			}
		}
		return input[targetIndex];
	}
}
