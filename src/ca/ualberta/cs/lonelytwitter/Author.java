package ca.ualberta.cs.lonelytwitter;

public class Author extends User implements UserLike { //Author = subclass, User = superclass

	public Author(String string) {
		super(string);
	} 
	@Override
	public void setName(String name) {
		this.name = name; 
	}
	
}
