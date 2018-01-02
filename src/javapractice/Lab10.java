package javapractice;

public class Lab10 {
public static void main(String[] args) {
	Hello h=new Hai();
	System.out.println(h.x);
	
}
}
class Hello{
	int x=10;
}
class Hai extends Hello{
	String x="Pankaj";
}

