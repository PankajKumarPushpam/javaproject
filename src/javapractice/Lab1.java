package javapractice;

import java.util.*;

public class Lab1 {
	public static void main(String[] args) {
		Map mp=new LinkedHashMap();
		mp.put(101, "Pankaj");
		mp.put(51, "Ram");
		mp.put(23, "Abhishek");
		mp.put(27, "Nitin");
		mp.put(66, "Loyal");
		mp.put(236, "Ritesh");
		mp.put(154, "Kaushik");
		mp.put(520, "Mahi");
		
		System.out.println(mp);
		System.out.println("********keySet()************");
		Set st=mp.keySet();
		Iterator it=st.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
		System.out.println("********values()************");
		Collection col=mp.values();
		Iterator it1=col.iterator();
		while(it1.hasNext()){
			Object obj1=it1.next();
			System.out.println(obj1);
		}

		System.out.println("********Key and Value************");
		
		Set st1=mp.entrySet();
		Iterator it2=st1.iterator();
		while(it2.hasNext()){
			Object obj2=it2.next();
			System.out.println(obj2);
		}
		
	}

}
