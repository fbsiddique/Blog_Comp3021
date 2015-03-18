package base;

import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Post implements Comparable<Post>, Serializable{
	private Date date;
	private String content;
	public Post(Date date, String content) {
		this.date = date;
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ret = formatter.format(date);
		ret = ret + ", " + content;
		return ret;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean ans = true;
		if (o == null) {
			ans = false;
		}
		if (o.getClass() != this.getClass()) {
			Post post = (Post) o;
			if (!this.date.equals(post.date) && !this.content.equals(post.content)) {
				ans = false;
			}
		}
		return ans;
	}
	
	@Override
	public int hashCode() {
		int hashCode = 0;
		int temp1 = date.hashCode();
		int temp2 = content.hashCode();
		hashCode = temp1 + temp2;
		return hashCode;
	}
	
	public boolean contains(String keyword) {
		boolean ans = true;
		if(this.content.contains(keyword))
	    {
	        return true;
	    }
		return false;
	}
	
	@Override
	public int compareTo(Post p){
		return this.date.compareTo(p.date);
	}
	
}
