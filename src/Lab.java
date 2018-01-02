public class Lab {
public static void main(String[] args){
    Student st1=new Student();
    st1.setSid(101);
    st1.setSName("Pankaj");
    System.out.println(st1.getSid()+"\t"+st1.getSName());
	}
}
class Student{
int sid;
String sname;
  public void setSid(int sid){
	  this.sid=sid;
  }
  public void setSName(String  sname){
	  this.sname=sname;
  }
  public int getSid(){
	  return sid;
  }
  public String getSName(){
	  return sname;
  }

}
