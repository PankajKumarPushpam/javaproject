package InterviewQuestions;

public class Lab29 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i<=j)
					System.out.print("O");
				else
					System.out.print("X");
			}
			System.out.println();
		}
	}

}
