package LabExecise1;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	int year;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any year ");
	year=scan.nextInt();
	scan.close();
	boolean isleap=false;
	if (year%4==0) 
	{
		if(year%100==0)
		{
			if(year%400==0) 
				isleap=true;
				else 
				 isleap=false;
		}	
		else {isleap=true;
		}}
	else { 
		isleap= false;
	}
	if(isleap==true) {
		System.out.println(year+" is leap year ");
	}
	else {
		System.out.println(year+" is not leap year");
}
}
}
