package in.cemk.training;

public class StringHandeling {

	public static void main(String[] args) {
		//strings are immutable i.e they can't be changed once declared
		String name = "M Hari Kishore";
		
		// every operation here crates a new string
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf("H"));
		System.out.println(name.substring(0, 8));
		System.out.println(name.concat(" Kolaghat"));
	}

}
