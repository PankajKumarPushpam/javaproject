package javapractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String username="Pankaj";
	transient String pwd="123450";
}
class SerializationDemo2 {
	public static void main(String[] args) throws Exception {
		Account a1=new Account();
		System.out.println(a1.username+"\t"+a1.pwd);
		
		FileOutputStream fos=new FileOutputStream("abc.exe");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis=new FileInputStream("abc.exe");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a2=(Account) ois.readObject();
		System.out.println(a2.username+"\t"+a2.pwd);
	}

}
