
public class Lab9 {

	public static void main(String[] args) {
		int arr[]={2,3,4,7,6,5,8,9,12,13,13,45};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nAfter sorting");
		
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}

}
