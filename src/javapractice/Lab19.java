package javapractice;
import java.util.*;
public class Lab19 {
	public static void main(String[] args) {
		ArrayList<String> emails=new ArrayList<String>();
		emails.add("pk@gmail.com");
		emails.add("rk@gmail.com");
		emails.add("kh@yahoo.com");
		emails.add("ygnd@gmail.com");
		emails.add("lkl@gmail.com");
		emails.add("sjs@gmail.com");
		emails.add("ssa@gmail.com");
		
		ArrayList<Long> phones=new ArrayList<Long>();
		phones.add(618769828769L);
		phones.add(6861728769L);
		phones.add(6192634769L);
		phones.add(14444528769L);
		phones.add(17814328769L);
		phones.add(78963269L);
		phones.add(974624658769L);
		
		Map<String,Long> refs=new LinkedHashMap<String, Long>();
		
		
		Student2 st=new Student2(99,"Pankaj",emails,phones,refs);
		
		ArrayList<Student2> stList=new ArrayList<Student2>();
		stList.add(st);
		stList.add(st);
		stList.add(st);
		stList.add(st);
		stList.add(st);
		stList.add(st);
		stList.add(st);
		System.out.println(stList);
	}
}
class Student2{
	int sid;
	String name;
	List<String> emails;
	List<Long> phones;
	Map<String,Long> refs;

	Student2(int sid,String name,List<String> emails,List<Long> phones,Map<String,Long> refs){
		this.sid=sid;
		this.name=name;
		this.emails=emails;
		this.phones=phones;
		this.refs=refs;

	}
	public String toString() {
		return sid +"\n"+ name +"\n"+ emails +"\n"+ phones +"\n"+ refs+"\n";

	}

}
