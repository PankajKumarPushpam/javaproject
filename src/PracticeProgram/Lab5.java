package PracticeProgram;

import java.util.Arrays;

public class Lab5 {

	public static void main(String[] args) {
		int arr[]={9,3,8,5,3,2,1};
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.print(arr[i]+" ");
		}
	}

}
