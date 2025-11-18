package packageA;

public class MyBaseClass {
	
	public int pub_var = 10;  // Accessed from anywhere
	
	protected int prot_var = 20; 
	/* Accessed from 
		1. Same package subclass(y), 
		2. Same package non subclass(y)
		
		3. Different package subclass(y)
		4. Different package non subclass(n)
	*/
	
	int def_var = 25; 
	/* Accessed from 
	1. Same package subclass(y), 
	2. Same package non subclass(y)
	
	3. Different package subclass(n)
	4. Different package non subclass(n)
	 */
	private int priv_var = 30; // only be accessed in the same class
	
}
