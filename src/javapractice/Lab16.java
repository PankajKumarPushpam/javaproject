package javapractice;

import java.util.*;

public class Lab16 {

	public static void main(String[] args) {
		StudentDetails<Integer,String> st=new StudentDetails<Integer,String>();
		st.id=101;
		st.name="pankaj";
		System.out.println(st);
		
		StudentDetails<String,String> st1=new StudentDetails<String,String>();
		st1.id="CC-ST-028";
		st1.name="pankaj";
		System.out.println(st1);
			
		StudentDetails<Float,String> st2=new StudentDetails<Float,String>();
		st2.id=462454.2486f;
		st2.name="pankaj";
		System.out.println(st2);
		
		StudentDetails<Long,String> st3=new StudentDetails<Long,String>();
		st3.id=4624542486L;
		st3.name="pankaj";
		System.out.println(st3);
		
	}
}
class StudentDetails<I,N>{
	I id;
	N name;
	

	public String toString() {
		return id+"\t\t"+name;
	}
}
