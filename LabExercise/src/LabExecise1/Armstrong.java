package LabExecise1;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		
int number= 153, originalNumber, remainder, result=0 ;
originalNumber= number;
 while(originalNumber!=0)
 {
	 remainder=originalNumber%10;
	 result += Math.pow(remainder, 3);
	 originalNumber/=10;
 }
 if(result==number)
 {
 System.out.println("Number "+result+" is Amstrong");
 }
 else
 { 
	 System.out.println("Number "+result+" is  not Amstrong");
 }
}
}