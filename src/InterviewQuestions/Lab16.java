package InterviewQuestions;

public class Lab16 {
	public static void main(String[] args) {
	ABC ref=new XYZ();
	ref.show();
	}
}
interface ABC{
	 void show();
}
interface ABC1{
	 void show();
}
class XYZ implements ABC,ABC1{
	public void show() {
		System.out.println("Show in XYZ");
	}
}
