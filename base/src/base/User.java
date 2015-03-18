package base;

import java.io.Serializable;
import java.util.Date;

public class User implements Comparable<User>, Serializable{
	private int userId;
	private String userName;
	private String userEmail;
	
	public User(int userId, String userName, String userEmail) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}
	
	public int getuserId() {
		return this.userId;
	}
	public void setuserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getuserEmail() {
		return this.userEmail;
	}
	public void setuserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + userId;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(User u){
		if(this.userId>u.userId){
			return 1;
		}
		else if(this.userId<u.userId){
			return -1;
		}
		else
			return 0;
	}
	
	
}
