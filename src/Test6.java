class medicalStore{
	String tabletName1;
	String tabletName2;
	String tabletName3;
	medicalStore(String tabletName1,String tabletName2,String tabletName3){
		this.tabletName1=tabletName1;
		this.tabletName2=tabletName2;
		this.tabletName3=tabletName3;
	}
	public String toString() {
		return tabletName1+"\t"+tabletName2+"\t"+tabletName3;
	}
}
class Customer implements Cloneable{
	String name;
	String email;
	String city;
	long mob;
	medicalStore store;
	Customer(String name,String email,String city,long mob,medicalStore store){
		this.name=name;
		this.email=email;
		this.city=city;
		this.mob=mob;
		this.store=store;
	}
	public String toString() {
		return name+"\t"+email+"\t"+city+"\t"+mob+"\t"+store;
	}
	public Object Clone() throws CloneNotSupportedException{
		if(this instanceof Cloneable){			
			medicalStore store=new medicalStore(this.store.tabletName1,this.store.tabletName2, this.store.tabletName3);
			Customer cst=new Customer(this.name, this.email, this.city, this.mob, this.store);
			return cst;
		}
		else
			throw new CloneNotSupportedException(getClass().getName());
	}
}
public class Test6 {
	public static void main(String[] args) throws CloneNotSupportedException{
		medicalStore store=new medicalStore("paracetamole","nice", "megapen");
		Customer cst=new Customer("Pankaj","pkp@gmail.com", "Bengalore", 8602643995L, store);
		Customer cst1=(Customer) cst.Clone();
		System.out.println(cst);
		System.out.println(cst1);
		System.out.println(cst.equals(cst1));
		}
}
