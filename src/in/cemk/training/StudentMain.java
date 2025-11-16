package in.cemk.training;
import java.util.*;

                                                                            
public class StudentMain {
	public static void main(String[] args) {
		//initialize object array
		ArrayList<StudentBean> stu_list = new ArrayList<StudentBean>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of student to be inserted: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			StudentBean stu_ele = new StudentBean();
			
			System.out.println("Enter the name of the " + (i+1) +" student: ");
			stu_ele.setName(sc.next());
			
			System.out.println("Enter the email: ");
			stu_ele.setEmail(sc.next());
			
			System.out.println("Enter the roll no: ");
			stu_ele.setRollno(sc.next());
		
			System.out.println("Enter the Incentive: ");
			stu_ele.setIncentive(sc.nextDouble());
			
			stu_list.add(stu_ele);
		}
		
		double totalIncentive = 0.0D;
		double averageIncentive = 0.0D;
		double maxIncentive = 0.0D;
		double minIncentive = 0.0D;
		
		for(StudentBean stu: stu_list) {
			System.out.println(stu.getName()+ " " + stu.getIncentive());	
			totalIncentive += stu.getIncentive();
			
			if (stu.getIncentive() > maxIncentive) {
				maxIncentive = stu.getIncentive();
			}
			else if(stu.getIncentive() < minIncentive) {
				minIncentive = stu.getIncentive();
			}
				
		}
		System.out.println("The total incentive of the students is: " + totalIncentive);
		System.out.println("The average incentive is: " + totalIncentive/n);
		System.out.println("The max incentive is: " + maxIncentive);
		System.out.println("The min incentive is: " + minIncentive);
		
		
	}
}
