package InterviewQuestions;

public class Lab18 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++){
				if((j==1||j==5)||(i==1||i==5)){
					System.out.print("3 ");
				}else if(i==3&&j==3){
					System.out.print("1 ");
				}else{
					System.out.print("2 ");
				}
			}
			System.out.println();
		}
	}
}
