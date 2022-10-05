package VariablePrograms;

public class NonStaticVariableExample1 {
	int age;
	boolean res;
	char grade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("program starts");

NonStaticVariableExample1 ref1=new NonStaticVariableExample1();
System.out.println("default value of age is:"+ref1.age);
System.out.println("default value of res is:"+ref1.res);
System.out.println("default value of grade is:"+ref1.grade);
System.out.println("*****************************");

ref1.age=16;
ref1.res=true;
ref1.grade='A';

System.out.println("updated value of age is:"+ref1.age);
System.out.println("updated value of res is:"+ref1.res);
System.out.println("updated value of garde is:"+ref1.grade);
	}

}