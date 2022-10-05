package ThisKeywords;

public class Keywords01 {
	int rollno;
	float fee;
	Keywords01(int rollno, float fee){
	rollno=rollno;
	fee=fee;
	}

	void display() {
	System.out.println(rollno+""+fee);
	}


	public static void main(String[] args) {
	Keywords01 c1=new Keywords01(12,23f);
			

	}

}
