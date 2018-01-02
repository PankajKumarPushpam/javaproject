package javapractice;

class Vehicle{
	void run(){
		System.out.println("Vehicle is running safely");
	}
}
class Bike1 extends Vehicle{
	void run(){
		System.out.println("Bike is running safely");
	}
}
public class Lab11 {
	public static void main(String[] args) {
		Bike1 bk=new Bike1();
		bk.run();
	}

}
