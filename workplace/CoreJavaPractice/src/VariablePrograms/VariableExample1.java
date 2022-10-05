package VariablePrograms;

public class VariableExample1 {
	static int age;
	static boolean res;
	static char grade;
	static float roi;

	public static void main(String[] args) {
		System.out.println("programs starts");
		System.out.println("default value of int " +age);
		System.out.println("default value of boolean " +res);
		System.out.println("default value of char " +grade);
		System.out.println("default value of float " +roi);
		
		
		age=25;
		res=true;
		grade='A';
		roi=6.5f;
		
		System.out.println("updated value of age:" +age);
		System.out.println("updated value of res: " +res);
		System.out.println("updated value of grade: " +grade);
		System.out.println("updated value of roi: " +roi);
		System.out.println("programs end");
		
		
		
		


	}

}
