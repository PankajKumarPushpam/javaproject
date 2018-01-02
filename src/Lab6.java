
public class Lab6 {
	public static void main(String[] args) {
		int arr[]={6,7,4,1,3,2,1,12,6,7,12,32,12};
		
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					int temp=0;
					if(arr[i]>arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			} 
			System.out.println("\nAfter shorting");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("\nAfter Removing");
			int b=0;
			arr[b]=arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(arr[b]!=arr[i]){
					b++;
					arr[b]=arr[i];				
			}				
			}
			for (int i = 0; i <=b; i++) {
				System.out.print(arr[i]+" ");
			}
			
	}	
}