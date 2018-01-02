public class Lab1 {
public static void main(String[] args) {

    System.out.println(A.m1());
    System.out.println(A.m2());
   }
}
class A{
	static public int m1(){
		return 2*3;
	}
	static public int m2(){
		return m1();
	}
}
