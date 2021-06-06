package LabExecise1;

public class SwapNumber {
	public static void main(String[] args) {
		int first=500, second=400;

		System.out.println("---Before swapping---");
		System.out.println("first number is"+first);
		System.out.println("second number is"+second);
		
		first=first-second;
		second=first+second;
		first=second-first;
		
		System.out.println("---Before swapping---");
		System.out.println("first number is"+first);
		System.out.println("second number is"+second);
		
	}
}
