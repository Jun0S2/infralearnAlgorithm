package ArrayAlgorithm;
/**Date: 07/21/2021
 * Author: June Park
 * Success
 * 
 * */
import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get Input:
		Scanner sc = new Scanner(System.in);
		int numStudents= sc.nextInt();
		int[] heights=new int[numStudents];
		for(int i = 0; i < numStudents ; i++) {
			heights[i] = sc.nextInt();
		}
		Height h = new Height ();
		System.out.println(h.compare(heights));
		
	}
	public int compare(int[] heights) {
		int canSee = 1;
		int isBiggerThan=heights[0];
		
		for(int x : heights) {
			if(x>isBiggerThan) {
				isBiggerThan = x;
			//	System.out.println(canSee);
				canSee++;
				
			}
			
		}
		return canSee;
	}
	

}
