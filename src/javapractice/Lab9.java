package javapractice;

public class Lab9 {
	public static void main(String[] args) {
		Bike ref=new Scooty();
		ref.gear();
	}
}
abstract class Bike{
	abstract void gear();	
}
class Scooty extends Bike{
	void gear() {
		System.out.println("gear()-->Scooty");
	}
	
}