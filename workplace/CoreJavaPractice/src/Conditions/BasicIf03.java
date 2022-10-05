package Conditions;

public class BasicIf03 {

	public static void main(String[] args) {
	int age=18;
	char blood='A';
	if(age>=18)
	{
	System.out.println("you are eligibal to donate the blood go head for the next process ");
	if(blood=='A') {
	System.out.println("you are eligibal to donate blood");
	}
	else {
	System.out.println("you are not eligibal to donate the blood your blood is not match");
	}
	}
	else {
	System.out.println("you are not eligibal to donate the blood as your age is below18");
	}
			
		// TODO Auto-generated method stub

	}

}
