package InterviewQuestions;

public class Lab10 {
	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.m1();
		obj.m2();
		Outer.Inner obj1=new Outer.Inner();
		obj1.show();
	}
}
class Outer{
	int a=10;
	static int b=20;
	void m1(){
		System.out.println("Outer-->m1()");
	}
	static void m2(){
		System.out.println("Outer-->m2()");
	}
	static class Inner{
		int x=30;
		void show(){
			System.out.println("Inner-->show()");
			//System.out.println(a);
			System.out.println(b);
			System.out.println(x);
		}
	}
}
