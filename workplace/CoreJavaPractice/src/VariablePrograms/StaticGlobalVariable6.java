package VariablePrograms;

public class StaticGlobalVariable6 {
	static int age;
	static char grade;
	static float roi;
	static boolean res;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
age=14;
System.out.println("age:"+age);
age=13;
grade='A';
roi=3.5f;
res=true;
System.out.println("updated value of age is:"+age);
System.out.println("updated value of grade is:"+grade);
System.out.println("update value of roi is:"+roi);
System.out.println("updated value of res is:"+res);
	}

}
