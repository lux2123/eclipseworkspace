package TypeCasting;

public class PrimitiveCasting2 {

	public static void main(String[] args) {
		int Salary=30000;
		/*explicit widening*/
		double SalaryDouble=(double)Salary;
		
		float SalaryFloat=(float)Salary;
		
		System.out.println("****************explicit widening********************");
		
		System.out.println("salary:"+Salary+"\nSalaryDouble:"+SalaryDouble+"\nsalaryFloat:"+SalaryFloat);
		
		System.out.println("*******************implicit widening***************************************");
		/* implicit widening or autowidening*/
		
		double salaryDouble2=Salary;
		float salaryFloat2=Salary;
		System.out.println("salary:"+Salary+"\nsalaryDouble2:"+salaryDouble2+"\nsalaryFloat2:"+salaryFloat2);
		
		double SalaryDb=30000.35d;
		/*explicit narrowing*/
		int SalaryInt=(int)SalaryDb;
		float SalaryFt=(float)SalaryDb;
		System.out.println("**************************explicit narrowing*********************");
		System.out.println("SalaryDb:"+SalaryDb+"\nSalaryInt:"+SalaryInt+"\nSalaryFt:"+SalaryFt);
		
		/*implicit narrowing not possible*/
		//int SalaryInt2=SalaryDb;
		//float SalaryFt2=SalaryDb;
		
		

	}

}
