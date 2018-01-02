package javapractice;

public class Lab14 {

	public static void main(String[] args) {
		A ref=new A();
		ref.print();
		ref.show();
	}
}
interface printable{
	void print();
}
interface showable{
	void show();
}
class A implements printable,showable{
	public void print() {
		System.out.println("print");
	}
	public void show() {
		System.out.println("show");
	}

}
