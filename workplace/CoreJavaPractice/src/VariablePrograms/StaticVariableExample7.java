package VariablePrograms;

public class StaticVariableExample7 {
	static int age;
	static char grade;
	static boolean res;
	static float roi;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("default value of age is:"+age);
System.out.println("default value of grade is:"+grade);
System.out.println("default value of res is:"+res);
System.out.println("default value of roi is:"+roi);
System.out.println("******************************************");
age=15;
grade='B';
res=true;
roi=3.5f;
System.out.println("updated value of age is:"+age);
System.out.println("updated value of grade is:"+grade);
System.out.println("updated value of res is:"+res);
System.out.println("updated value of roi is:"+roi);
	}

}
