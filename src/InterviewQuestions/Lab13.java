package InterviewQuestions;

public class Lab13 {
   public static void main(String[] args) {
	Person1 p=new Person1(){
		void sleep() {
			System.out.println("Student-->sleep()");
		}
		};
		p.sleep();
   }
}
abstract class Person1{
	abstract void sleep();
}

