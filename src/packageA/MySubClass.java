package packageA;

public class MySubClass extends MyBaseClass {

	public static void main(String[] args) {
		MySubClass subClass = new MySubClass();
		System.out.println("The Public variable accessed from a sub class: " + subClass.pub_var);
		System.out.println("The Protected variable is accessed from a sub class: " + subClass.prot_var);

	}

}
