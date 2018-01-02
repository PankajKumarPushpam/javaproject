import java.util.*;
public class Lab7 {

	public static void main(String[] args) {
		/*
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		int k=0;
		char arr[]=str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==' '){
				i--;
				for (int j = i; j >=k; j--) {
					System.out.print(arr[j]);
				}
				i++;
				k=i;
				System.out.print(arr[i]);
			}
			if(i==arr.length-1){
				for (int j = i; j >=k; j--) {
					System.out.print(arr[j]);
				}	
			}
		}
		*/
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j<=i; j++) {
				if((i+j)%2==0){
					System.out.print("1");	
				}else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
