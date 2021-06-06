package LabExecise1;
import java.util.Scanner;
public class AreaOfRectangle {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the lenth of rectangle");
	double lenth=scan.nextDouble();
	System.out.println("Enter the width of rectangle");
	double width=scan.nextDouble();
	double area=lenth*width;
	System.out.println("Area of Rectangle "+area);
}
}
