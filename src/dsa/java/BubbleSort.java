package dsa.java;

public class BubbleSort {
	
	public static void sort(int [] arr) {
		int size = arr.length;
		boolean is_swap = false;
		int temp = 0;
		
		for(int i=0; i<size; i++) {
			for (int j=0; j<size-1-i; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					is_swap = true;
				}
			}
			if(!is_swap) {
				System.out.println("The array is already sorted.");
				break;
			}
		}
		System.out.print("The sorted array is: " );
		for(int x: arr) {
			System.out.print(x + " ");
		}
		
	}
	public static void main(String[] args) {
		int arr []= {3, 4, 5, 23, 38, 92};
		sort(arr);
	}

}
