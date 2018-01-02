package InterviewQuestions;

public class Lab12 {

	public static void main(String[] args) {
		System.out.println("Hello Panakj");
		Person p=new Student();
		p.sleep();
	}
}
abstract class Person{
	abstract void sleep();
}
class Student extends Person{
	void sleep() {
		System.out.println("Student-->sleep()");
	}
	
}
