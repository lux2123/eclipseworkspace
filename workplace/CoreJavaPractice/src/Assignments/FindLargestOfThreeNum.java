package Assignments;

public class FindLargestOfThreeNum {
	
	int findLargestOfThreeNum(int a, int b, int c) {
		int larNum;
		if(a>b && a>c) {
		larNum=a;
		}
		else if(b>a&&b>c) {
			larNum=b;
		
		}
		else
		{
			larNum=c;
		}
		return larNum;
	}

	public static void main(String[] args) {
		FindLargestOfThreeNum obj=new FindLargestOfThreeNum();
		int larNum=obj.findLargestOfThreeNum(65,25,55);
		System.out.println("Largest Number is:"+larNum);
			
		
		}

	}



