package test;

public class Student {
	int stuId;
	String stuName;
	String emailId;
	Mydate joiningDate;
	
	public Student()
	{
		
	}
	public Student(int stuId,String stuName,String emailId,Mydate joiningDate)
	{
		this.stuId=stuId;
		this.stuName=stuName;
		this.emailId=emailId;
		this.joiningDate=joiningDate;
		
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Mydate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Mydate joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	public String toString()
	{
		return stuId+" "+stuName+" "+emailId+" "+" "+joiningDate;
    }
	public static void main(String[] args) {
		
		Student s1=new Student (101,"Vishal","AsatiVishal&gmailcom",new Mydate(21,12,1997));
		Student s2=new Student (102,"Sagar","sagar&gmailcom",new Mydate(12,1,1998));
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
