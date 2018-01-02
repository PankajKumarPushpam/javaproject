package javapractice;

import java.util.*;

public class Lab18 {
   public static void main(String[] args) {
	Map<Integer,String> mp=new LinkedHashMap<Integer,String>();
	mp.put(101, "Pankaj");
	mp.put(51, "Ram");
	mp.put(23, "Abhishek");
	mp.put(27, "Nitin");
	mp.put(66, "Loyal");
	mp.put(236, "Ritesh");
	mp.put(154, "Kaushik");
	mp.put(520, "Mahi");
	
	Set<Map.Entry<Integer,String>> st=mp.entrySet();
	Iterator<Map.Entry<Integer,String>> it=st.iterator();
	while(it.hasNext()){
		Map.Entry<Integer,String> entry=it.next();
		Integer key=entry.getKey();
		String values=entry.getValue();
		System.out.println(key+"\t"+values);
	}
}
}
