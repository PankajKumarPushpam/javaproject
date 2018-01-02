package javapractice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab8 {

	public static void main(String[] args) {
		Map<String,String> mp=new TreeMap<String,String>(new DSComparator());
		mp.put("Bihar", "Pankaj");
		mp.put("M.P", "Ram");
		mp.put("KA", "Abhishek");
		mp.put("G.P", "Nitin");
		mp.put("A.P", "Loyal");
		mp.put("NewYork", "Ritesh");
		mp.put("M,P", "Kaushik");
		mp.put("H.P", "Tina");
		
		System.out.println(mp);

		Set st=mp.entrySet();
		Iterator it=st.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
	}
}
class DSComparator implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Object && o2 instanceof Object){
			String s1=(String) o1;
			String s2=(String) o2;
			return s2.compareTo(s1);
		}
		return 0;
	}

}

