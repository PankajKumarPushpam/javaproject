package PracticeProgram;

import java.util.*;

public class Lab4 {
	public static void main(String[] args) {
		TreeSet st=new TreeSet();
		st.add(23);
		st.add(25);
		st.add(12);
		st.add(14);
		st.add(5);
		st.add(27);
		st.add(55);
		st.add(7);
		st.add(32);		
		System.out.println(st);//[5, 7, 12, 14, 23, 25, 27, 32, 55]
		System.out.println("\n***subSet***");
		System.out.println(st.subSet(7, 32));
		System.out.println(st.subSet(7,true,32,true));
		System.out.println(st.subSet(7,false,32,true));
		
		System.out.println("\n*********headSet*******");
		System.out.println(st.headSet(55));
		System.out.println(st.headSet(55,true));
		System.out.println(st.headSet(14,true));
		System.out.println("\n******tailSet********");
		System.out.println(st.tailSet(12));
		System.out.println(st.tailSet(14,false));
		System.out.println(st.tailSet(7));
         
		System.out.println("\n*******poolFirst()/poolLast()******");
		System.out.println(st.pollFirst());
		System.out.println(st.pollLast());
		System.out.println(st);
		
		System.out.println(st.first());
		System.out.println(st.last());
		
		System.out.println("\n*******higher()********");
		System.out.println(st.higher(12));
		System.out.println(st.higher(14));
		
		System.out.println("\n********Lower()**********");
		System.out.println(st.lower(23));
		
		System.out.println("\n*******ceiling*************");
		System.out.println(st.ceiling(7));
		System.out.println(st.ceiling(13));
		System.out.println(st.ceiling(23));
		
		System.out.println("\n***********floor***********");
		System.out.println(st.floor(12));
		System.out.println(st.ceiling(55));		
		
	}

}
