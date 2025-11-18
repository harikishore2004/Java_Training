package packageB;

import packageA.MyBaseClass;

public class MySubClass extends MyBaseClass{

	public static void main(String[] args) {
		MySubClass mySubClass = new MySubClass();
		System.out.println("Public variable accessed from a different package sub class: " + mySubClass.pub_var);
		System.out.println("Protected variable accessed from a different package sub class: " + mySubClass.prot_var);
		
		

	}

}
