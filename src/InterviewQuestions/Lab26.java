package InterviewQuestions;

public class Lab26 {

	public static void main(String[] args) {
		int rowCount=1;
		for(int i=5;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++){
				System.out.print("* ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
