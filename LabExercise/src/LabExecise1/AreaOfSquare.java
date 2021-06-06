package LabExecise1;

import java.util.Scanner;

public class AreaOfSquare {
public static void main(String[] args) {
	System.out.println("Enter the side ");
	Scanner scan=new Scanner(System.in);
	double side=scan.nextDouble();
	double area=side*side;
	System.out.println("Area of square "+area);
}
}
