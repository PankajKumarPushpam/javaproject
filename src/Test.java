import java.util.*;
  public class Test {
		public static void main(String[] args) {
	  	String str="Hi This is jlc,java Learning Center";
	  	StringTokenizer tok=new StringTokenizer(str);
	  	System.out.println("Count:"+tok.countTokens());
	  	
		while(tok.hasMoreElements()){
	  		String data=tok.nextToken();
	  	System.out.println(data);
	  }
		System.out.println("Count:"+tok.countTokens());
		
		
		System.out.println("\nWith, Delimiter\n");
		String data="99 Pankaj pkp1996@gmail.com 8602643995L";
		StringTokenizer tkn=new StringTokenizer(data,",");
		int id=Integer.parseInt(tkn.nextToken());
		String nm=tkn.nextToken();
		String eml=tkn.nextToken();
		long phn=Long.parseLong(tkn.nextToken());
		
		
		System.out.println("id:"+id);
		System.out.println("Name:"+nm);
		System.out.println("Email:"+eml);
		System.out.println("Phone:"+phn);
  }
 }