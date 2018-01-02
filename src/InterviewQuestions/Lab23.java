package InterviewQuestions;

public class Lab23 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++){
			for(j=1;j<=7-i;j++){
				System.out.print(1);	
			}
			for(j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
/*
O/p
1111111
1111122
1111333
1114444
1155555
1666666
7777777
 */
