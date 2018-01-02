package InterviewQuestions;

import java.util.*;

public class InterviewCoding {
	public static void main(String[] args) {
		/*
		//1.fibonicci series
		int num;
		int a,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();

		for (int i = 0; i <=num; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}


		//2.prime Number
		int num;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
        num=sc.nextInt();
        for (int i = 2; i < num; i++) {
        	if(num%i==0){
		count++;
		break;
		}
        }
        if(count==0){
        	System.out.println("Number is Prime");
        }else{
        	System.out.println("Number is not Prime");
        }


		//3.Perfect Number
		int num;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		for (int i = 1; i < num; i++) {
			if(num%i==0){
				sum=sum+i;						
			}
		}
		if(num==sum){
			System.out.println("Number is Perfect");
		}else{
			System.out.println("Number is not Perfect");
		}

		//4.Factorial 
		int num;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		for (int i = 1; i <=num; i++) {
		fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);


		//5.Reverse String

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		char arr[]=str.toCharArray();
		for (int i =arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i]);
		}

		//6.Reverse word-by-word of String

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		char arr[]=str.toCharArray();
		int k=0;
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

		//7.find Max and Min Value from the array

		int arr[]={2,32,12,12,43,1,23,54,51};
		int min=arr[0];
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(min);
        System.out.println(max);		


		//8.palindrom

		int num;
		int rev=0;
		int rem;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		temp=num;
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev){
			System.out.println("Number is Palindrom");
		}else{
			System.out.println("Number is not Palindrom");
		}


		//9.Armstrong Number

		int num;
		int sum=0;
		int r;
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		x=num;
		while(num>0){
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;			
		}
		if(x==sum){
			System.out.println("Number is Armstrong");
		}else{
			System.out.println("Number is not Armstrong");
		}

		//10.Even and Odd
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
			if(num%2==0){
				System.out.println("Number is Even");
			}else{
				System.out.println("Number is Odd");				
			}


		//11.find maximum number

		int a;
		int b;		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the First Number");
		a=sc.nextInt();
		System.out.println("Enter the Second Number");
		b=sc.nextInt();

		if(a>b){
			System.out.println("a is biggger Number");
		}else if(b>a){
			System.out.println("b is biggger Number");
		}else{
			System.out.println("Number is equal");
		}


		//12.find maximum number from the array
		int arr[]={12,25,75,34,2,12,99,34,23,12,21};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(max);


		//13.swap two number without using third variable

		int a=12;
		int b=13;		
		System.out.println("Before swapping "+a+"  "+b);		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping  "+a+"  "+b);


		//14.Strong Number

		int num;
		int sum=0;
		int r;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		temp=num;
		while(num>0){
			r=num%10;
			int f=1;
			for (int i = 1; i <=r; i++) {
			f=f*i;	
			}
			sum=sum+f;
			num=num/10;
		}
		if(sum==temp){
			System.out.println(temp+" is Strong Number");
		}else{
			System.out.println(temp+" is not Strong Number");
		}
		
		//15.Reverse Number
		
		int num;
		int rem;
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		
		 
		//16.Sum of Digit
		
				int num;
				int rem;
				int sum=0;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Number");
				num=sc.nextInt();
				while(num>0){
					rem=num%10;
					sum=sum+rem;
					num=num/10;
				}
				System.out.println(sum);
				
				
		//17.Check Alphabate or not

		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z'||ch>='A' && ch<='Z'){
			System.out.println(ch+" is a Alphabate");
		}else{
			System.out.println(ch+" is not Alphabate");
		}
		
		//18.Non-Repeating Character in the String
		 
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		for(char ch:str.toCharArray()){
			if(str.indexOf(ch)==str.lastIndexOf(ch)){
				System.out.println("non repeated character in the String is "+ch);
			}
		}
		
		//19.find duplicate element from the array

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
		
		o/p
		Before Shorting
		1  12  2  21  6  7  4  17  
		After shorting
		1  2  2  4  4  4  4  17  
		After Removing duplicate value
		1  2  4  17 

		
		

		//20.swaping using third variable

		
		int a=12;
		int b=13;
		System.out.println(a+"\t"+b);
		int temp=a;//12
		a=b;
		b=temp;
		System.out.println(a+"\t"+b);
		
		
	//21.pattern	

		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		o/p
		5 4 3 2 1 
		5 4 3 2 
		5 4 3 
		5 4 
		5 
     

		//22.pattern
		int i,j,k;
		for(i=1; i<=5; i++){

			for(j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(k=1; k<=(2*i-1); k++) {
				if(k%2==0) {
					System.out.print(" 1 ");	
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

		 *
		* 1 *
	  * 1 * 1 *
    * 1 * 1 * 1 *
  * 1 * 1 * 1 * 1 *


		//23.write a program to reverse the String

				String str;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the String");
				str=sc.nextLine();
				char arr[]=str.toCharArray();
				for(int i=arr.length-1;i>=0;i--) {
					System.out.print(arr[i]);
				}


		//24.write a program to short the string without using built in method
				String str="agdcbef";
				char temp=0;
				char[] arr=str.toCharArray();
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr.length;j++) {
						if(arr[i]>arr[j]) {
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
				for(int k=arr.length-1;k>=0;k--) {
					System.out.print(arr[k]);
				}
		//25.write a program of given String is palindrom

				String str,rev="";
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the String value");
				str=sc.nextLine();
				for(int i=str.length()-1;i>=0;i--) {
					rev=rev+str.charAt(i);
				}
				if(str.equals(rev)) {
					System.out.println("String is palindrom");
				}
				else {
					System.out.println("String is not palindrom");
				}
		//26.write a program to remove vowel in the given string

				String str,newStr;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the String");
				str=sc.nextLine();
				newStr=str.replaceAll("[aeiouAEIOU]", "");
				System.out.println("After Removing of vowel:"+newStr);



		//27.write a program of given Pattern		

				for(int i=1;i<=4;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print(""+i);
					}
					System.out.println();
				}

				o/p
				1
				22
				333
				4444

		//28.write a program of given Pattern

				for(int i=1;i<=4;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print(""+j);
					}
					System.out.println();
				}
				o/p
				1
				12
				123
				1234

		//29.write a program of given Pattern

				char i,j;
				for( i='A';i<='E';i++) {
					for(j='A';j<=i;j++) {
						System.out.print(""+i);
					}
					System.out.println();
				}

				o/p
				A
				BB
				CCC
				DDDD
				EEEEE

		//39.write a program of given Pattern

						char i,j;
						for( i='A';i<='E';i++) {
							for(j='A';j<=i;j++) {
								System.out.print(""+j);
							}
							System.out.println();
						}		
				o/p
				A
				AB
				ABC
				ABCD
				ABCDE

		//31.write a program of given Pattern

				for(int i=5;i>=1;i--) {
					for(int j=1;j<=i;j++) {
					System.out.print(""+i);		
					}
					System.out.println();
				}
				o/p
				55555
				4444
				333
				22
				1

		//32.write a program of given Pattern		
				for(int i=5;i>=1;i--) {
					for(int j=1;j<=i;j++) {
					System.out.print(""+j);		
					}
					System.out.println();
				}
				o/p
				12345
				1234
				123
				12
				1

			//32.write a program of given Pattern	
				for(int i=1;i<=5;i++) {
					for(int j=5;j>=i;j--) {
					System.out.print(""+j);		
					}
					System.out.println();
				}
		o/p
		54321
		5432
		543
		54
		5


		//33.write a program of given Pattern	

				for(int i=1;i<=5;i++) {
					for(int j=5;j>=i;j--) {
					System.out.print(""+i);		
					}
					System.out.println();
				}
		o/p
		11111
		2222
		333
		44
		5

		//34.write a program of given Pattern	
				for(int i=0;i<6;i++) {
					for(int j=0;j<6-i;j++){
						System.out.print(" ");
					}
					for(int k=0;k<i*2+1;k++) {
						System.out.print("*");
					}
					System.out.println();
				}
		o/p
		 *
		***
	   *****
	  *******
	 *********
	***********

		//35.write a program of given Pattern

				for(int i=0;i<=4;i++) {
					for(int j=0;j<=i;j++) {
						if((i+j)%2==0) {
						System.out.print("1");	
						}else {
							System.out.print("0");
						}
					}
					System.out.println();
				}
		o/p
		1
		01
		101
		0101
		10101

		//36.write a program to print how many times a charater is repeated

				String str="pankaj";
				Map<Character, Integer> m=new HashMap<Character, Integer>();
				char ch[]=str.toCharArray();
				for(char c:ch) {
					if(m.get(c)==null) {
						m.put(c, 1);
					}else {
						m.put(c, m.get(c)+1);
					}
				}
				System.out.println(m);
				Set s=m.entrySet();
				Iterator it=s.iterator();
				while(it.hasNext()) {
					Object obj=it.next();
					System.out.println(obj);
				}

   //37.pattern
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		o/p
		12345
		1234
		123
		12
		1

	//38.patern
		  for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		o/p
		54321
		5432
		543
		54
		5
		
		
		
  //39.pattern
		int i,j,k;
		for(i=1;i<=5;i++)
		{
		for(j=4;j>=i;j--)
		{
			
			System.out.print(" ");
		}
		for(k=1;k<=i;k++)
		{
			
			System.out.print("* ");
		}
		if((i+j)%2==0)
			System.out.print("1");
		System.out.println("");
		}
	}


o/p
    * 
   * * 
  * * * 
 * * * * 
* * * * * 


*/
  }
}
