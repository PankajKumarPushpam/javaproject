package InterviewQuestions;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		int count=0;
		for (int i = 2; i < num; i++) {
			if(num%i==0){
				count++;
				break;
			}			
		}
		if(count==0){
			System.out.println("Number is Prime");
		}else{
			System.out.println("Number is not Prime");
		}
	}

}
