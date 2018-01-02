import java.util.*;

public class Lab4 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    boolean b=true;
    for(int i=2;i<num;i++){
    	if(num%i==0){
    		b=false;
    		break;
    	}
    }
    if(b)
    	System.out.println("Number is Prime");
    else
    	System.out.println("Number is not Prime");
	}
}

