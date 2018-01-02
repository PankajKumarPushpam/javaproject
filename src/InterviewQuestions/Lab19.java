package InterviewQuestions;

public class Lab19 {
public static void main(String[] args) {
	System.out.print("*\n");
	for(int i=1;i<=5;i++){
		System.out.print("*");
		for (int j = 1; j <i; j++) {
			System.out.print(" ");	
		}
		System.out.println("*");
	}
	for(int j=1;j<=4;j++){
		System.out.print("* ");
	}
}
}
