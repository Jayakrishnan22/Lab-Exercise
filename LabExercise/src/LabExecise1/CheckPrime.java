package LabExecise1;
import java.util.Scanner;
public class CheckPrime {
public static void main(String[] args) {
	int temp;
	boolean prime=true;
	System.out.println("Enter the number");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	scan.close();
	for(int i=2;i<=num/2;i++)
			{
			temp=num % i;
				if (temp==0)
				{
				prime=false;
				break;
				}}
	if(prime)
				System.out.println(num+" is the prime number");
				else
					System.out.println(num+" is not a prime number");
			
	
}
}