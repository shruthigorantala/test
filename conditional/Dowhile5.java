package conditional;
import java.util.Scanner;
public class Dowhile5
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int choice;char ch;
	    Scanner sc=new Scanner(System.in);
	    do
	    {
		System.out.println("Enter your choice:");
		System.out.println("1- To check even or odd");
		System.out.println("2- To chech +,- and zero");
		System.out.println("3-To chech a palindrome");
		System.out.println("4- To chech Armstrong number");
		choice=sc.nextInt();
		switch(choice) 
		{
		case 1:
			System.out.print("Enter a number :");
			int a = sc.nextInt();
		     if(a%2 == 0)
		     {
			 System.out.println(a+"is even");
		     }else
		     {
			 System.out.println(a+" is odd");
		     }break;
		case 2:
			System.out.println("Enter number:");
			int num =sc.nextInt();
			if(num<0)
			{
			System.out.println("Negative");}
			else if(num>0) 
			{
				System.out.println("positive");}
			else 
			{
				System.out.println("Zero");
			}
			break; 
		case 3:
			int r=0;
			System.out.println("enter a number");
			int num1=sc.nextInt();
			int originalnum=num1;
			while(num1 != 0)
			{
				int digit=num1%10;
				r=r*10+digit;
				num1 /=10;
			}
			if(originalnum==r) 
			{
				System.out.println("palindrome");
			}
			else {
				System.out.println("Not palindrome");
			}
			break;
		case 4:
			System.out.println("enter a number");
			int n=sc.nextInt();
			int original = n;
			int result=0;
			int digit =0;
			while(original != 0)
			{
				digit++;
				original /=10;
		}
			original=n;
		while(original != 0) {
			int digits = original%10;
			result += Math.pow(digits, digit);
			original /= 10;
			}
		if(result==n) 
		{
			System.out.println("Armstrong number");
		}
		else 
		{
			System.out.println("Not Armstrong number");
		}break;	
		}	
		System.out.println("press y to continue or press any key to exit");
		ch=sc.next().charAt(0);
	    }
	while(ch=='y'||ch=='Y'); 
	}
}

