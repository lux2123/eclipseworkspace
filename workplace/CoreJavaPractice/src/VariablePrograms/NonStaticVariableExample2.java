package VariablePrograms;

public class NonStaticVariableExample2 {
	int age;
	float roi;
	char grade;
	boolean res;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NonStaticVariableExample2 ref=new NonStaticVariableExample2();
System.out.println("default value age is:"+ref.age);
System.out.println("default value roi is:"+ref.roi);
System.out.println("default value grade is:"+ref.grade);
System.out.println("default value res is:"+ref.res);
System.out.println("*******************************************");

ref.age=26;
ref.roi=2.4f;
ref.grade='A';
ref.res=true;

System.out.println("updated value of age is:"+ref.age);
System.out.println("updated value of roi is:"+ref.roi);
System.out.println("updated value of grade is:"+ref.grade);
System.out.println("updated value of res is:"+ref.res);


	}

}
