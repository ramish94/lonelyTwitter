package ca.ualberta.cs.lonelytwitter;
import java.io.IOException;

public abstract class User extends Object {
	protected String name;

	public String getName() {	// getter method
		return name;
	}

	public abstract void setName(String name) throws IOException; //Abstract method
	
	
	public User(String name) {	//constructor method
		super();
		this.name = name;
		
		/*same as 
		 * public User(String n) {
		 * 		super();
		 * 		name = n;
		 * }
		 * Don't need to use "this" because it has a different name
		 */
	}
	
	public User() {		// another constructor method, if we don't know the name
		super();
		name = "anonymous";
	}
	
}
