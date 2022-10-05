package Conditions;

public class Counter01 {
static void checkCounter(int num)
{
	int counter=0;
if(num%2==0) 
{
	System.out.println("even number:"+num);
	counter++;
	System.out.println(counter);

	}
else 
{
System.out.println("odd number:"+num);	
}
}



	public static void main(String[] args) {
		
		checkCounter(131);
		checkCounter(100);
		checkCounter(115);
		checkCounter(470);
		int count=0;
		for(int i=1;i<=10;++i)
			
		{
		System.out.println("hello:"+i);
		count++;
		
		}
System.out.println("count:"+count);
	}
	

}
