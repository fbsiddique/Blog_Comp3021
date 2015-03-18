package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Blog implements Serializable{
	private User user;
	private ArrayList<Post> allPosts;
	
	public Blog (User u){
		user = u;
		allPosts = new ArrayList<Post>();
	}
	
	public void setUser(User u){
		user = u;
	}
	
	public void setPost(ArrayList<Post> p){
		allPosts=p;
	}
	
	public User getUser(){
		return user;
	}
	
	public ArrayList<Post> getPost(){
		return allPosts;
	}
	
	public void post(Post p){
		if(allPosts.add(p)){
			System.out.println("Posted successfully!");
		}
	}
	
	public void list(){
		for(int i=0;i<allPosts.size();i++){
			System.out.println(allPosts.get(i).toString());
		}
	}
	
	public void delete(int index){
		if(index>=0 && index<allPosts.size()){
			allPosts.remove(index);
		}
		else{
			System.out.println("Invalid index!");
		}
	}

	@Override
	public String toString() {
		return "Blog [user=" + user + ", allPosts=" + allPosts + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allPosts == null) ? 0 : allPosts.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Blog other = (Blog) obj;
		if (allPosts == null) {
			if (other.allPosts != null)
				return false;
		} else if (!allPosts.equals(other.allPosts))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	public void save(String filepath){
		try{
			FileOutputStream oFile = new FileOutputStream(filepath);
			ObjectOutputStream outputObj = new ObjectOutputStream(oFile);
			outputObj.writeObject(this);
			outputObj.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void load(String filepath){
		try{
			FileInputStream iFile = new FileInputStream(filepath);
			try{
				ObjectInputStream inputObj = new ObjectInputStream(iFile);
				Blog temp = (Blog) inputObj.readObject();
				this.setUser(temp.getUser());
				this.setPost(temp.getPost());
				inputObj.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Cannot find the file!");
		}
	}
	
	
}
