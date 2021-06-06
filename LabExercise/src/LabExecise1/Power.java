package LabExecise1;

public class Power {
	public static void main(String[] args) {
		int base= 3, exponent= 4;
		long result= 1; 
		while(exponent != 0) {
			
			//result= result * base;
			
			result*=base;
			--exponent;
		
		}
		System.out.println("the power value is " +result);
	}

}
