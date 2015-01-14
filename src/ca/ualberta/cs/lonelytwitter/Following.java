package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Following extends User {

	ArrayList<User> following;
	@Override
	public void setName(String name) throws IOException {
		// TODO Auto-generated method stub
	}
	
	public void setFollowing(ArrayList<User> following) {
		this.following = following;
	}
	
	public ArrayList<User> showFollowing() {
		return following;
	}

}
