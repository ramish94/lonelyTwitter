package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Followers extends User {

	@Override
	public void setName(String name) throws IOException {
		// TODO Auto-generated method stub

	}
	
	ArrayList<User> followers;
	
	public void setFollowers(ArrayList<User> followers) {
		this.followers = followers;
	}
	
	public ArrayList<User> showFollowers() {
		return followers;
	}

}
