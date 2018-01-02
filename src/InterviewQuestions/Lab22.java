package InterviewQuestions;

import java.util.*;

public class Lab22 {

	public static void main(String[] args) {
		int r,i,j,k,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rows");
		r=sc.nextInt();
		for(i=0;i<r;i++){
			for(k=r;k>i;k--){
				System.out.print(" ");
			}
			number=1;
			for(j=0;j<=i;j++){
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			System.out.println();
		}
	}

}
