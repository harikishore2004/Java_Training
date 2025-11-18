package packageA;

public class MyNonSubClass {

	public static void main(String[] args) {
		MyBaseClass myBaseClass = new MyBaseClass();
		System.out.println("Public variable accessed from a non sub class: " + myBaseClass.pub_var);
		System.out.println("Protected variable accessed from a non sub class: " + myBaseClass.prot_var);
	}

}
