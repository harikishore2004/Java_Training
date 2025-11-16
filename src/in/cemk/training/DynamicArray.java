package in.cemk.training;
import java.util.*;

public class DynamicArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements to insert: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			list.add(sc.next());
		}

		for (String st: list) {
			System.out.print(st + " ");
		}


	}

}
