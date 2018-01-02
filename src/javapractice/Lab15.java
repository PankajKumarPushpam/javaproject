package javapractice;

import java.util.*;

public class Lab15 {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("Pankaj");
		lst.add("Ram");
		lst.add("Abhishek");
		lst.add("Sonu");
		lst.add("Monu");
		lst.add("Rahul");
		System.out.println(lst);
		
		Iterator<String> it=lst.iterator();
				while(it.hasNext()){
					String obj=it.next();
					System.out.println(obj);
				}
		
	}

}
