package ArrayAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class RSP {
/**Date: 07/21/2021 - 07/22/2021
 * Author:June Park
 * Rock Scissor Paper
 * */

	public static void main(String[] args) {
		//�˻� ���� ��� ��� ��
		
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
		//����1 ����2 ��3
		//a�� ������ �³���?
		char whoWon;
		switch(a) {
		//a�� ������ ����, b�� 3�̾�� �̰�
		case 1:whoWon=(b==3)?'A':'B';break;
		//a�� ������ ����, b�� ������ ����� �̰�
		case 2:whoWon=(b==1)?'A':'B';break;
		//a�� ���� ����, b�� 2�����̾�� �̰�
		case 3:whoWon=(b==2)?'A':'B';break;
		default: whoWon='D';
		}
		return whoWon;
	}

}
