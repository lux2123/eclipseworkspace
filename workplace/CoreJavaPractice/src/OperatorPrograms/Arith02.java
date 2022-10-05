package OperatorPrograms;

public class Arith02 {

	public static void main(String[] args) {
		// Variables Definition and Initialization
				boolean bool1 = true, bool2 = false;
				
				// Logical AND
				System.out.println("bool1 && bool2 = " + (bool1 && bool2));//

				// Logical OR
				System.out.println("bool1 || bool2 = " + (bool1 || bool2)); // 

				// Logical Not
				System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));//

			}
}

		
		//(LHS & RHS result should be in boolean format)
		//&& --> and

		//LHS && RHS ---> if both side are having result as true dn its will retur true else false
		//true && true --> true
		//false && true --> false
		//true && false --> false

		//|| --> or

		//LHS || RHS --> if any one side return true dn the result will be true else false
		//true || true --> true
		//false || true --> true
		//true || false --> true
		//false || false ---> false

		//! --> not

		// TODO Auto-generated method stub


