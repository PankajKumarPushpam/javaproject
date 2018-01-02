package javapractice;

import java.util.*;

public class Lab13 {

	public static void main(String[] args) {
		Map mp=new TreeMap(new DSComparator1());
		mp.put("India", "Pankaj");
		mp.put("Bhopal", "Rohit");
		mp.put("SINGHIA", "Abhishek");
		mp.put("RANCHI", "Dhoni");
		mp.put("UP", "Mahi");
		mp.put("SAMAS", "Virat");
		mp.put("BPL", "Ritesh");
		mp.put("AP", "Laloo");
		
		Set st=mp.entrySet();
		Iterator it=st.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
	}
}
class DSComparator1 implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Object && o2 instanceof Object){
			String i1=(String) o1;
			String i2=(String) o2;
			return i2.compareTo(i1);
		}
		return 0;
	}
	
}
