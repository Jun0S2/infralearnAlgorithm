package ArrayAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class RSP {
/**Date: 07/21/2021 - 07/22/2021
 * Author:June Park
 * Rock Scissor Paper
 * */

	public static void main(String[] args) {
		//검색 없이 됬다 흐규 ㅠ
		
		Scanner sc = new Scanner (System.in);
		int inputNum = sc.nextInt();
		int[] A= new int[inputNum]; int[] B= new int[inputNum];
		for(int i=0; i<inputNum;i++) {A[i]=sc.nextInt();}
		for(int i=0; i<inputNum;i++) {B[i]=sc.nextInt();}
		
		//Test:
		RSP r = new RSP();
		r.Printwinner(A, B);
		
	}
	/*Prints out winner: if a and b is same, print D, else call winTable */
	void Printwinner(int[] a, int[]b) {
		for(int i = 0;i<a.length;i++) {
			//if a== b'D'
			if(a[i]==b[i]) {System.out.print('D');}
			else {System.out.print(winTable(a[i],b[i]));}
		System.out.println();
		}
		
	}
	/*Wintable in perspective of A*/
	char winTable (int a,int b) {
		//가위1 바위2 보3
		//a가 무엇을 냈나요?
		char whoWon;
		switch(a) {
		//a가 가위를 내면, b가 3이어야 이겨
		case 1:whoWon=(b==3)?'A':'B';break;
		//a가 바위를 내면, b가 가위를 내어야 이겨
		case 2:whoWon=(b==1)?'A':'B';break;
		//a가 보를 내면, b가 2바위이어야 이겨
		case 3:whoWon=(b==2)?'A':'B';break;
		default: whoWon='D';
		}
		return whoWon;
	}

}
