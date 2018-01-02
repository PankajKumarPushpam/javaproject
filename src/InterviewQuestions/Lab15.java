package InterviewQuestions;

public class Lab15 {
	public static void main(String[] args) {
    Student1 st=new Student1();
    st.setSid(101);
    st.setName("Pankaj");
    System.out.println(st.getSid());
    System.out.println(st.getName());
	}
}
class Student1{
	int sid;
	String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
