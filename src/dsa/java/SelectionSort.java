package dsa.java;

public class SelectionSort {
	public static void sort(int arr[]) {
		
		int size = arr.length;
		int temp = 0;
		
		for(int i=0; i<size; i++) {
			int min_ele_index = i;
			
			for(int j=i+1; j<size; j++) {
				if (arr[min_ele_index] > arr[j]) {
					min_ele_index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min_ele_index];
			arr[min_ele_index] = temp;	
		}
		System.out.print("The sorted array using the selection sort: ");
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}
	public static void main(String[] args) {
		int arr []= {3, 4, 23, 5,38, 92};
		sort(arr);

	}

}
