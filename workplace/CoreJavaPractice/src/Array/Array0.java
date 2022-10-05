package Array;

public class Array0 {

	public static void main(String[] args) {
		String[] car;
		//or
		car=new String[4];
		car[0]="Volvo";
		car[1]="BmW";
		car[2]="Ford";
		car[3]="Mazda";
		//or
		String[] cars= {"Volvo","BMW","Ford","Mazda"};

		//access the element of an Array
		System.out.println(car[0]);//Volvo
		//change an array element
		car[0]="Opel";
		System.out.println(car[0]);//Opel
		//array element count
		
		System.out.println(car.length);//4
		System.out.println("*************************normal for loop**********************************");
		
		//iterate array element using for loop
		for (int i=0;i<car.length;i++) {
			System.out.println(car[i]);
		
		}
		
		System.out.println("****************************for-each loop****************************");
		
		//iterate array elements using for-each loop
		
		for(String i:car) {
			System.out.println(i);
		}
	}

}
