package InterviewQuestions;

public class Lab11 {
	public static void main(String[] args) {
    new Outer1().new Inner().show();;
	}
}
class Outer1{
	int a=10;
	class Inner{
		int a=20;
		void show(){
			System.out.println("Inner-->show()");
			int a=30;
			System.out.println(a);
			System.out.println(this.a);
			//System.out.println(super.a);
			System.out.println(Outer1.this.a);
		}
	}
}