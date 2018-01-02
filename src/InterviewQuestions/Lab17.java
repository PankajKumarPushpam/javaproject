package InterviewQuestions;

import java.util.*;

public class Lab17 {
	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		int rowCount=num;
		for(int i=0;i<num;i++){
			for(int j=1;j<=2*i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++){
				System.out.print(j+" ");
			}
			for(int j=rowCount-1;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println();
			rowCount--;
		}
	}

}
