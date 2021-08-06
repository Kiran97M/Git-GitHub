package in.ashokit.bindings;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class User {
   
	
	private Integer cid;
	private String fname;
	private String lname;
	private String email;
	
	 public  User() {
		 System.out.println("Object is created");
	 }
	 
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [cid=" + cid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
	
}
