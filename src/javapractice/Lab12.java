package javapractice;

public class Lab12 {

	public static void main(String[] args) {
		X xref=new X();
		Y yref=new Y();
		//yref.m1();
		//yref.m2();
		xref.m1();
		//System.out.println(xref.a); //can not invoke becoz a is private 
		xref=yref;
		//xref.a=10; //can not initialize becoz a is private 
	}
}
class X{
	private int a;
	int b;
	public void m1(){
		System.out.println("m1() in X class");
	}
}
class Y extends X{
	int c;
	public void m1(){
		System.out.println("m1() in Y class");
	}
	public void m2(){
		super.m1();
		System.out.println("m2() in Y class");
	}
}
