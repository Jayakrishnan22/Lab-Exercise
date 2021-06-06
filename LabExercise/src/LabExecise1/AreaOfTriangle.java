package LabExecise1;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		System.out.println("Enter the width of the triangle");
		Scanner scan=new Scanner(System.in);
		double base=scan.nextDouble();
		System.out.println("Enter the height of the triangle");
		double height=scan.nextDouble();
		double area=base*height;
		System.out.println("Area of triangle "+area);
	}

}
