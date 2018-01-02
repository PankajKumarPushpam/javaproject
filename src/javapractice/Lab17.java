package javapractice;
import java.util.*;
public class Lab17 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Pankaj");
		list.add("Ram");
		list.add("Abhishek");
		list.add("Rahul");
		list.add("Saurabh");
		
		Iterator<String>  it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
