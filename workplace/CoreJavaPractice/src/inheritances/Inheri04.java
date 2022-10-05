package inheritances;

class fourwhleer{
//default constructor
	public void wheels() {
	System.out.println("I have 4 wheels");
	}
}

//child class of fourwheeler and parent of maruti
class car extends fourwhleer{
	public void type() {
	System.out.println("I am a car");
	}
}

class maruti extends car{
public void company() {
	System.out.println("i am maruti");
}
}

public class Inheri04 {

	public static void main(String[] args) {
	maruti fr=new maruti();
	fr.wheels();
	fr.type();
	fr.company();

	}

}
