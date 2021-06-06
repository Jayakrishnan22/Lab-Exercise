package LabExecise1;
import java.util.Scanner;
public class ReverseNumberWhile {
public static void main(String[] args) {
	int num=0;
	int reverse=0;
	System.out.println("Enter the valve");
	Scanner scan=new Scanner(System.in);
	num=scan.nextInt();
	while(num != 0)
	{
	reverse=reverse*10;
	reverse=reverse+num%10;
	num=num/10;
	}
	System.out.println("Reverse of input number is "+reverse);
	}
}