import java.io.*;
class ExternalizalbeDemo implements Externalizable{
	String s;
	int i;
	int j;
	ExternalizalbeDemo() {
	System.out.println("public No-Arg Constr");
}
ExternalizalbeDemo(String s,int i,int j){
	this.s=s;
	this.i=i;
	this.j=j;
}
public void writeExternal(ObjectOutput out) throws IOException{
	out.writeObject(s);
	out.writeObject(i);
	
}
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	s=(String)in.readObject();
	i=in.readInt();
}	
	public static void main(String args[]) throws Exception {
		ExternalizalbeDemo d1=new ExternalizalbeDemo("Pankaj",10,20);
		
		FileOutputStream fos=new FileOutputStream("abc.exe");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("abc.exe");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternalizalbeDemo d2=(ExternalizalbeDemo) ois.readObject();
		System.out.println(d2.s+"\t"+d2.i+"\t"+d2.j);
	}

}