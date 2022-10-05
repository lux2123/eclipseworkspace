package predefinedclasses;

public class class1 {

	public static void main(String[] args) {
		class1 c1=new class1();
		System.out.println("c1:"+c1);
		
		String s1="mumbai";//new object will be crete in string constant pool
		String s2="mumbai";//no object will be create as its a duplicate object,so s2 will point s1 object
		String s3="bangalore";//new object will  be create in constant pool
		
		System.out.println("s1"+s1);//object value because toString()is overrided in string class
		System.out.println("s2"+s2);
		System.out.println("s3"+s3);
		System.out.println("s1 char count:"+s1.length());//6
		System.out.println("s2 char count:"+s2.length());//6
		System.out.println("s3 char count:"+s3.length());//9
		
		/**
		 * Outside String class:
		 * 		== --> compare two values
		 * 		.equals(obj) --> compare two objects based on there address
		 * Inside String class:
		 * 		== --> compare two objects based on address
		 * 		.equals(obj) --> compare two objects based on value
		 */
		
		System.out.println("s1 & s2 using equals():"+s1.equals(s2));//compare s1 and s2 values
		System.out.println("s1 & s2 using'==':"+(s1==s2));//compare s1 & s2 based on address
		
		System.out.println("s1 & s3 using equals():"+s2.equals(s3));//compare s1 and s3 values
		System.out.println("s1 & s3 using'==':"+(s1==s3));//compare s1 & s3 based on address
		
		String s4=new String("mumbai");//two object-->1. constant pool 2. in non-constant pool
		System.out.println("s4:"+s4);
		
		System.out.println("s1 & s4 using equals():"+s1.equals(s4));//compare s1 and s4 values-->
		System.out.println("s1 & s4 using'==':"+(s1==s4));//compare s1 & s2 based on address
		
		String s5=new String("mumbai");
		System.out.println("s5:"+s5);
		
		System.out.println("s4 & s5 using equals():"+s4.equals(s5));
		System.out.println("s4 and s5 using'==':"+(s4==s5));
		
		String s6=new String("Hyderabad");
		System.out.println("s6:"+s6);
		
		System.out.println("s5 and s6 using equals():"+s5.equals(s6));
		System.out.println("s5 and s6 using'==':"+(s5==s6));
		
		/**
		String-->	
				predefined class in java belongs to java.lang package 
				it represents group/collection of characters
				In String class following methods are override
						1. toString() --> instead of printing string representation of object it will print value stored 
										  inside the string object
						2. equals()   ---> overrided 
						3. hashCode()
				We can create String class object in two ways
					1. by using new keyword
								---> object will be stored in non constant pool
								---> by using this we can have duplicate object also
					2. by using literal 
								---> object will be stored in String constant pool(inside heap)
								---> by using this we can create only unique object inside the pool
		*/
		

	}

}
