package InterviewQuestions;

import java.util.*;

public class Lab14 {
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		for(char ch:str.toCharArray()){
			if(str.indexOf(ch)==str.lastIndexOf(ch)){
				System.out.println("Non-Repeating Word---> "+ch);

			}		
		}
	}
}
