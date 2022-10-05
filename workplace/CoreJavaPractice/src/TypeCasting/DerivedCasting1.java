package TypeCasting;

class member{
	//member variable of this class long phone;
	//member function of this class 
	void chat() {
		//print message of member/child class
		System.out.println("chatting in whatsapp group with"+phone);
	}
}
class Admin extends member{
	//member function of this class
	void addNumber() {
		//print message of Admin/parent class
		System.out.println("adding a new number in whatsapp group");
	}
}


public class DerivedCasting1 {

	public static void main(String[] args) {
		member m=new Admin();//upcastin
		

	}

}
