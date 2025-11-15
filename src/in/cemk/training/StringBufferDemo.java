package in.cemk.training;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		// Here we are using 3 objects since the string are immutable
		String fname = "Hari";
		String lname = " Kishore";
		String fullname = fname + lname;
		System.out.println("Full name is: " + fullname);
		
		// Here we have used only single object thus optimizing the memory
		// **Note - In place of StringBuffer we can also use StringBuilder(new version of the buffer) 
		StringBuffer sb = new StringBuffer("Hari");
		sb.append(" Kishore");
		System.out.println("Buffered string is: " + sb);
		
	}

}
