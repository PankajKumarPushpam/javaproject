package InterviewQuestions;

import java.util.Scanner;

public class Lab28 {

	public static void main(String[] args) {
		int rowCount=1;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		for(int i=num;i>0;i--){
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
			rowCount++;
		}
		
	}

}
