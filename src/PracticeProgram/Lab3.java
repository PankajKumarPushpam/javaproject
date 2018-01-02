package PracticeProgram;

import java.util.*;

public class Lab3 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(new Student(101,"pankaj"));
		ts.add(new Student(564,"Ram"));
		ts.add(new Student(124,"Abhishek"));
		ts.add(new Student(59,"Nilesh"));
		ts.add(new Student(254,"Pandey"));
		ts.add(new Student(452,"Ajay"));
		ts.add(new Student(365,"Vikash"));
		System.out.println("*******sorting the element on the bassis of Sid******");
		//System.out.println(ts);
		
		Iterator it=ts.iterator();
		while(it.hasNext()){
			Object obj1=it.next();
			System.out.println(obj1);
		}
	}
}
class Student implements Comparable{
	int sid;
	String name;

	Student(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	public String toString() {
		return sid+"\t"+name;
	}
	public int compareTo(Object obj) {
		if(this instanceof Student){
			Student st=(Student) obj;
			//return this.sid-st.sid;
			return st.sid-this.sid;
			//return st.name.compareTo(name);
		}
		return 0;  
	}

}
