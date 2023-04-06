import java.util.Scanner;


public class Day8_2
{
	public static void main(String args[])
	{
        int totalbill;
Scanner sc = new Scanner(System.in);

  
        System.out.println("Enter your name: ");
      String name = sc.next();
    
    

System.out.println("Enter your Telephone number : ");
int tel = sc.nextInt;


System.out.println("Enter number of calls made : ");
int n = sc.nextInt;


System.out.println("Enter duration of calls in minutes : ");
int d = sc.nextInt;


	if(n<=100)
    { totalbill=0.5*n*d;}
	
    else if(n>100)
	{
	 totalbill=0.25*n*d;	
	}
	
 
	System.out.println("total bill of "+name+"having phone number- "+tel+" is Rs. "+totalbill);
	 
	}
}