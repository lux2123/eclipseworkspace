package Array;

public class Array2 {

	public static void main(String[] args) {
		//creat an array
		int[] age= {12,4,25,2,5};
		//access each array elements
		System.out.println("Accessing Element of Array:");
		System.out.println("First element:"+age[0]);
		System.out.println("second element:"+age[1]);
		System.out.println("third element:"+age[2]);
		System.out.println("fourth element:"+age[3]);
		System.out.println("fourth element:"+age[4]);
		
		System.out.println("array size:"+age.length);
		
		System.out.println("***************************Using for Loop*********************");
		
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
			// if(age[i]==25){
			//
			System.out.println(age[i]);
			//brak;
			//}else{
			//
			System.out.println("age is not 25");
			//
		}

	

	
	System.out.println("***************************Using for each loop***********************:");
	for(int a:age) {
		System.out.println(a);
		if(a==25) {
			System.out.println(a);
			break;
		}else {
			System.out.println("age is not 25");
		}
	}
	
	
	
	
	
	

	}
}

