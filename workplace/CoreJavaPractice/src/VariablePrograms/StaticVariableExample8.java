package VariablePrograms;

public class StaticVariableExample8 {
	static int age;
	static boolean res;
	static char grade;
	static float roi;

	public static void main(String[] args) {
		// we can access static gobal variables using classname from here as main () is also static
		
		System.out.println("default value of age is:"+StaticVariableExample8.age);
		System.out.println("default value of res is:"+StaticVariableExample8.res);
		System.out.println("default value of grade is: "+ StaticVariableExample8.grade);
		System.out.println("default value of roi is:"+StaticVariableExample8.roi);
		
		System.out.println("*********************************************");
		
		StaticVariableExample8.age=13;
		StaticVariableExample8.res=true;
		StaticVariableExample8.grade='A';
		StaticVariableExample8.roi=4.7f;
		
		System.out.println("updated value of age is:"+StaticVariableExample8.age);
		System.out.println("updated value of res is:"+StaticVariableExample8.res);
		System.out.println("updated value of grade is:"+StaticVariableExample8.grade);
		System.out.println("updated value of roi is:"+StaticVariableExample8.roi);
		

	}

}
