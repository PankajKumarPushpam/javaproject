package InterviewQuestions;

import java.util.*;

public class Lab25 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		int rowCount=1;
		for(int i=num;i>1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++){
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
