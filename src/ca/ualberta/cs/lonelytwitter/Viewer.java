package ca.ualberta.cs.lonelytwitter;
import java.io.IOException;

public class Viewer extends User  {
	public void setName(String name) throws IOException { // setter method
		if (name.length() > 8) {
			throw new RuntimeException("Too long!");
		}
		this.name = name;
	}
}
