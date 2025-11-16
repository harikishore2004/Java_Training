package in.cemk.training;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		String arr[] = new String[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(String st: arr) {
			System.out.println(st);
		}
	}

}
