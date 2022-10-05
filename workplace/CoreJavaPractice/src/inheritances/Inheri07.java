package inheritances;

class fruits{
	int fruitAge;
	fruits(){
	System.out.println("fruits class cons");
	fruitAge=7;
	}
	public void taste() {
	System.out.println("fruits are sweet");
	}
	}
	
	class orange extends fruits{
	int fruitAge;
	orange(){
	System.out.println("orange class cons");
	fruitAge=5;
	}
	public void taste() {
	System.out.println("orange are sweet");
	}
	
	public void shape() {
	System.out.println("orange is round");
	System.out.println("orange fruitAge is:"+fruitAge);
	System.out.println("fruits fruitAge:"+super.fruitAge);
	 taste();
	 super.taste();
	 
	
	}
	}


public class Inheri07 {
	
	
	public static void main(String[] args) {
		orange fr=new orange();
		fr.shape();

	}

}

//super is a keyword or instance of super class
//class non-static members mainly used when subclass and super class having common non-static members
