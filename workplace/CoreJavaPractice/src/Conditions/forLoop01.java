package Conditions;

public class forLoop01 {

	public static void main(String[] args) {
		for(int i=0;i<10;++i) {
		System.out.println(i);
		i=i+1;
		}
		
	System.out.println("*******printing odd number*********************");
		// TODO Auto-generated method stub

	
	
	for(int i=1;i<50;i++) {
	if(!(i%2==0)){
	System.out.println(i);
	}
	}
	System.out.println("************printing even number********************");
	for(int i=50;i>0;i--) {
	if((i%2==0)) {
	System.out.println(i);
	}
	}
	
	System.out.println("**************************INFINITE loop****************");
	
	for(int i=0;i>=0;i++) {
	if((i%2==0)) {
	System.out.println(i);
	}
	}

}
}
