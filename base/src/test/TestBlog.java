package test;

import java.io.*;
import java.util.Date;
import base.*;

public class TestBlog {
	
	public String getInput(){
		String line = "";
		System.out.print("Enter the prompt:");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return line;
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBlog testBlog = new TestBlog();
		User user = new User(1, "COMP3021", "COMP3021@cse.ust.hk");
		Blog myBlog = new Blog(user);
		String prompt=null;
		
		while(!(prompt=testBlog.getInput()).equals("exit")){
			if(prompt.startsWith("list")){
				myBlog.list();
			}
			else if(prompt.startsWith("post")){
				Date date = new Date();
				String content=prompt.substring(5);
				Post post = new Post(date,content);
				myBlog.post(post);
			}
			else if(prompt.startsWith("delete")){
				int i=Integer.parseInt(prompt.substring(7));
				myBlog.delete(--i);
			}
		}
	}*/

}
