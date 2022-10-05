package predefinedclasses;

public class Stringclass3 {

	public static void main(String[] args) {
		String str1="DhanoriPune";
		char c=str1.charAt(0);
		System.out.println("char at index 0:"+c);
		
		//to print one by one character of string
		
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
			
		}
		
		System.out.println("*************************************");
		//to print one by one character of sring from the last index
		
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("********************************************");
		String temp="";//"Dhanoripune";//output enupironahD
		for(int i=str1.length()-1;i>=0;i--) {
			temp=temp+str1.charAt(i);//""+e=>e+n=>en+u=>enu
			
		}
		
		System.out.println("str1:"+str1);
		System.out.println("temp:"+temp);
		System.out.println(reverseString("DhanoriPune"));
		
		
		
		

	}

}