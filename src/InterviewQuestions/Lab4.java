package InterviewQuestions;

public class Lab4 {

	public static void main(String[] args) {
		
		//swaping using third variable

		/*
		int a=12;
		int b=13;
		System.out.println(a+"\t"+b);
		int temp=a;//12
		a=b;
		b=temp;
		System.out.println(a+"\t"+b);
		
		*/
		/*
	//pattern	

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
     */
		
/*
		//pattern
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


		//4.write a program to reverse the String

				String str;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the String");
				str=sc.nextLine();
				char arr[]=str.toCharArray();
				for(int i=arr.length-1;i>=0;i--) {
					System.out.print(arr[i]);
				}


		//5.write a program to short the string without using built in method
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
		//7.write a program of given String is palindrom

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
		//9.write a program to remove vowel in the given string

				String str,newStr;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the String");
				str=sc.nextLine();
				newStr=str.replaceAll("[aeiouAEIOU]", "");
				System.out.println("After Removing of vowel:"+newStr);



		//11.write a program of given Pattern		

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

		//12.write a program of given Pattern

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

		//13.write a program of given Pattern

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

		//14.write a program of given Pattern

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

		//15.write a program of given Pattern

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

		//16.write a program of given Pattern		
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

			//17.write a program of given Pattern	
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


		//18.write a program of given Pattern	

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

		//19.write a program of given Pattern	
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

		//20.write a program of given Pattern

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

		//21.write a program to print how many times a charater is repeated

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

			   //pattern
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

		//patern
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
		
		
		//pattern
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
