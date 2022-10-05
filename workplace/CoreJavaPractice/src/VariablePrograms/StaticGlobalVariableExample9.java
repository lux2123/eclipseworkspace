package VariablePrograms;

public class StaticGlobalVariableExample9 {
	static int num1,num2=25,res;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("number1 is:"+num1);
		System.out.println("number2 is:"+num2);
		res=num1+num2;
		System.out.println("result of two no is:"+res);
		
		num1=20;
		System.out.println("updated number1 is:"+num1);
		System.out.println(" numbaer2 is:"+num2);
		res=num1+num2;
		System.out.println("updated result is:"+res);

	}

}
