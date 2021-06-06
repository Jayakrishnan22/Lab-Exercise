package LabExecise1;
import java.util.Scanner;
public class SwitchCase {
public static void main(String[] args) {
	char operator;
	double num1, num2, result;
	Scanner scan=new Scanner(System.in);
	System.out.println("Choose the Operator +, -, * or / ");
	operator=scan.next().charAt(0);
	System.out.println("enter the number1 ");
	num1=scan.nextDouble();
	System.out.println("enter the number2");
	num2=scan.nextDouble();
	scan.close();
	switch(operator) {
	case '+':
			result= num1 +num2;
			System.out.println(num1 + " + " + num2 + " = "+ result);
			break;
	case '-':
		result= num1 - num2;
		System.out.println(num1 + " - " + num2 + " = "+ result);
		break;

	case '*':
		result= num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " +result);
		break;

	case '/':
		result= num1 / num2;
		System.out.println( num1 + " / " + num2 + " = " +result);
		break;
	default:
			System.out.println(" please enter the valid Operator " );
		break;

	}
	scan.close();
}
}
