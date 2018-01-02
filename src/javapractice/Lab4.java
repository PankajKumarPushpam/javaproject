package javapractice;

import java.util.*;
import java.util.Map.Entry;


public class Lab4 {

	public static void main(String[] args) {
		Map mp=new TreeMap();
		mp.put("Bihar", "Pankaj");
		mp.put("M.P", "Ram");
		mp.put("KA", "Abhishek");
		mp.put("G.P", "Nitin");
		mp.put("A.P", "Loyal");
		mp.put("NewYork", "Ritesh");
		mp.put("M,P", "Kaushik");
		mp.put("H.P", "Mahi");		
		System.out.println(mp);

		Set st=mp.entrySet();
		Iterator it=st.iterator();

		while(it.hasNext()){
			Map.Entry me=(Entry) it.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}
}

