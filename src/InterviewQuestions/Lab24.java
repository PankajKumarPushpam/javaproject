package InterviewQuestions;

public class Lab24 {
	public static void main(String[] args) {
		int i,j;
		int rows=5;
		for(i=1;i<=rows;i++){
			int number=i;
			for(j=1;j<=i;j++){
				System.out.print(number+" ");
				number=number+rows-j;				
			}
			System.out.println();	
		}		
	}
}
