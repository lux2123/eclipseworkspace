package TypeCasting;
class member{
	//member variable of this class long phone;
	//member function of this class
	void chat() {
		//print message of member/child class
		System.out.println("chatting in whatsapp group with "+phone);
	}
}
class Admin extends member{
	//member function of this class 
	void addNumber() {
		//print message of Admin/parent class
		System.out.println("adding a new user  number in whatsapp group");
	}
}

public class DerivedCasting2 {

	public static void main(String[] args) {
		member m=new Admin();//upcasting-implicit
		m.phone=9619654799l;
		//calling function
		m.chat();
		
		System.out.println("**********************After downcasting**************************");
		
		Admin ad= (Admin) m;//Downcasting to access specific property of subclass
		
		ad.addNumber();
		ad.chat();
		System.out.println(ad.phone);
		//Admin a1=new member();//direct downcasting,invalid or not possible
		
	}

}

/**
 * child class object referenced by any of its parent known as up casting
 * 
 * parent class object referenced by any of its child class known as downcasting
 * directly downcasting is not possible in java
 * 
 * child c2=new child();//downcasting but not possible in this way
 * 
 * parent p1=new child();//upcasting-implicit upcasting

child c1=(child)p1;//downcasting,as upcasting object is getting down casted here.