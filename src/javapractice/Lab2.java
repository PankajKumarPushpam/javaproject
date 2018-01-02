package javapractice;

import java.util.*;
import java.util.Map.Entry;
public class Lab2 {

	public static void main(String[] args) {
		Map mp=new TreeMap();
		mp.put(101, "Pankaj");
		mp.put(51, "Ram");
		mp.put(23, "Abhishek");
		mp.put(27, "Nitin");
		mp.put(66, "Loyal");
		mp.put(236, "Ritesh");
		mp.put(154, "Kaushik");
		mp.put(520, "Mahi");
		
		System.out.println(mp);
		
		Set st=mp.entrySet();
		Iterator it=st.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			Map.Entry me=(Entry) obj;
			Object key=me.getKey();
			Object val=me.getValue();
			System.out.println(key+"------->"+val);
		}
		
	}
}
