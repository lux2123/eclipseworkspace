package Conditions;

public class EvenOdd {

	public static void main(String[] args)
	{
		int counter=0;
	for(int i=100;i>0;i--) 
	{
		if(i%2==0)
		{
counter++;

			System.out.println("even number:"+i);
			
			
		}
		else
		{
			System.out.println("odd number:"+i);
		}
	}
	System.out.println(counter);

	}

}
