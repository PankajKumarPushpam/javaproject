package InterviewQuestions;

import java.util.Scanner;

public class Lab {
public static void main(String[] args) {
	String str,rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	str=sc.nextLine();
	for (int i = str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
	}
	if(str.equals(rev)){
		System.out.println("String is Palindrom");
	}else{
		System.out.println("String is not Palindrom");
	}
}
}
