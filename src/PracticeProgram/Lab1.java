package PracticeProgram;
import java.util.*;
public class Lab1 {
	public static void main(String[] args) {
		System.out.println("Before sorting");
		int arr[]={1,2,31,2,1,1,21,13,21,3,23,33,2,32,3};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\nAfter sorting");
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\nAfter Removing Duplicates");	
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
