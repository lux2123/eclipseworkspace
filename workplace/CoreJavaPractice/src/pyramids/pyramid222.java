package pyramids;

public class pyramid222 {
	
	void pyramid55() {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void pyramid205() {
		for(int i=1;i<=7;i++) {
			for(int j=7;j>=i;j--) {
				System.out.print("*       ");
			}
			System.out.println();
		}
		
	}
	
	void pyramid44() {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}

	public static void main(String[] args) {
		pyramid222 obj=new pyramid222();
		obj.pyramid55();
		System.out.println("*********************************");
		obj.pyramid205();
		obj.pyramid44();
		System.out.println("*********************************");


	}

}
