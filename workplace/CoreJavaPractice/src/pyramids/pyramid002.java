package pyramids;

public class pyramid002 {
	
	void pyaramid11() {
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print("* " );
				
			}
			System.out.println();
		}
	}
	
	void Number() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	void Alphabet() {
		char ch='A';
		for(int i=ch;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch++);
			}
			System.out.println();
			
		}
	}
	void Alphabet2() {
		
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramid002 ref=new pyramid002();
		ref.pyaramid11();
		ref.Number();
		ref.Alphabet();
		ref.Alphabet2();

		
		

	}

}
