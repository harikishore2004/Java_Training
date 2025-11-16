package in.cemk.training;
import java.util.*;
public class ArrayAge {

	public static void main(String[] args) {
		int arr[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i: arr) {
			System.out.println(i);
		}
	}

}
