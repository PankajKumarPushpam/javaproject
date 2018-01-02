package PracticeProgram;
import java.util.*;
public class Lab2 {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter the Charcater");
		char ch=(char)System.in.read();
		if(ch>=65&&ch<=90){
			System.out.println("Chracter is upper case: "+ch);
		}else if(ch>=97&&ch<=122){
			System.out.println("Character is lower case: "+ch);
		}else{
			System.out.println("Numeric digit");
		}
		
	}

}
