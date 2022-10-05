package ThisKeywords;




public class thiskey03 {
	
	int age=20;
	void call() {
		System.out.println("i am call method");
		
	}
	
	void m(int age) {
	
		System.out.println("local age:"+age);
		System.out.println("global age:"+this.age);
	}

	public static void main(String[] args) {
		thiskey03 t=new thiskey03();
		t.call();
		t.m(30);
		

	}

}
