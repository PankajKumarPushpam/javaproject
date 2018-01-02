package InterviewQuestions;

public class Lab3 {

	public static void main(String[] args) {
		
		int arr[]={1,12,2,21,6,7,4,17};
		System.out.println("Before Shorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
				}
			}
		}
		System.out.println("\nAfter shorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\nAfter Removing duplicate value");
		int b=0;
		arr[b]=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[b]!=arr[i]){
				b++;
				arr[b]=arr[i];
			}
		}
		for (int i = 0; i <=b; i++) {
			System.out.print(arr[i]+"  ");			
		}
	}
}
