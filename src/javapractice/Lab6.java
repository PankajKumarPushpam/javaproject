package javapractice;

public class Lab6 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Pankaj");
		Student st=new Student(101, sb,22);
		System.out.println(st);
		sb.append("Ram");
		System.out.println(st);
		StringBuilder sb2=new StringBuilder("Abc");
		Student st1=new Student(101, sb2,22);
		System.out.println(st1);
		sb2.append("XYZ");
		System.out.println(st1);
		
	}
}
final class Student{
	private final int sid;
	private final StringBuilder name;
	private final int age;
	
	Student(int sid,StringBuilder name,int age){
		this.sid=sid;
		this.name=new StringBuilder(name);
		this.age=age;
	}
	public String toString() {
		return sid+" "+name+" "+age;
	}
	public int getSid(){
		return sid;
	}
	public StringBuilder getName(){
		return new StringBuilder(name);
	}
	public int getAge(){
		return age;
	}
}
