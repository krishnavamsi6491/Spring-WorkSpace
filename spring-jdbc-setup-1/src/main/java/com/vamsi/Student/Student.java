package com.vamsi.Student;

//import com.vamsi.Repository.object;

public class Student {
	
	private int pid;
	private String pname;
	private String pemail;
	
	public Student() {
		
	}
	
	public Student(int pid) {
		this.pid=pid;
		
	}
	
public Student( String pname, String pemail) {
		
		this.pname = pname;
		this.pemail = pemail;
	}

	public Student(int pid, String pname, String pemail) {
		
		this.pid = pid;
		this.pname = pname;
		this.pemail = pemail;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	@Override
	public String toString() {
		return "Student [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + "]";
	}

	
	

}
