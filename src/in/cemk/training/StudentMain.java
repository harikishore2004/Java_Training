package in.cemk.training;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentBean studentBean = new StudentBean();
		
		// setting the object values
		studentBean.setEmail("temp@gmail.com");
		studentBean.setRollno("abc-107");
		studentBean.setAge(21);
		studentBean.setMobileno(1234567891);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name: ");
		String name = sc.nextLine();
		studentBean.setName(name);

		
		// accessing the values
		System.out.println("The name of the student is: " + studentBean.getName());		
	}
}
