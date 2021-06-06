package LabExecise1;
import java.util.Scanner;
public class CircleDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	double radius=scan.nextDouble();
	double area=Math.PI*(radius*radius);
	System.out.println("Area of circle "+area);
	double circum=Math.PI*2*radius;
	System.out.println("Circumference of circle "+circum);
}
}