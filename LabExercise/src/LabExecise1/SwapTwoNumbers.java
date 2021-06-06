package LabExecise1;

public class SwapTwoNumbers
{
	public static void main(String[] args)
	{
		int first=100, second=200 ;
		System.out.println("---Before swapping---");
		System.out.println("First number... "+first);
		System.out.println("second number..."+second);
		int temp = first;
			 first = second;
			second = temp;
				System.out.println("---After swapping---");
		System.out.println("First number..."+first);
		System.out.println("second number..."+second);
	}
}
