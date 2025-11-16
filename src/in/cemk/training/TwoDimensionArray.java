package in.cemk.training;
import java.util.*;

public class TwoDimensionArray {
	public static void main(String[] args) {

		int arr[][] = new int [2][3];
		Scanner sc = new Scanner(System.in);
		
		// input the values
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// output the values
		for(int[] row: arr) {
			for(int ele: row) {
				System.out.print(ele+ " ");
			}
			System.out.println(" ");
		}		
	}
}
