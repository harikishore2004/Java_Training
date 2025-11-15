package in.cemk.training;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		
		// normal loop
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// for each loop
		System.out.println("These are the results fo the for each loop");
		for(int x:arr) {
			System.out.println(x);
		}

	}
}
