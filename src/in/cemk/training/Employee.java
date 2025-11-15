package in.cemk.training;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		
		int age;
		String name;
		String empId;
		double salary;
		String gender;
		boolean empStatus;
		long mobileNo;
		float incentive;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the employee: ");
		name = sc.nextLine();
		
		System.out.println("Age: ");
		age = sc.nextInt();
		
		System.out.println("Emp Id: ");
		empId = sc.next();
		
		System.out.println("Salary: ");
		salary = sc.nextDouble();
		
		System.out.println("Gender: ");
		gender = sc.next();
		
		System.out.println("Emp Status: ");
		empStatus = sc.nextBoolean();
		
		System.out.println("Mobile No: ");
		mobileNo = sc.nextLong();
		
		System.out.println("Incentive: ");
		incentive = sc.nextFloat();

		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(salary);		
		System.out.println(empId);
		System.out.println(empStatus);
		System.out.println(mobileNo);
		System.out.println(incentive);

	}

}
