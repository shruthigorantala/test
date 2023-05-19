package conditional;

import java.util.Scanner;

public class Dowhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
	    char ch, choice;
	    Scanner sc=new Scanner(System.in);
	    do {
		System.out.print("Enter 2 numbers :");
		a = sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter your choice: + - * /");
		choice=sc.next().charAt(0);
		switch(choice) {
		case '+':
			c=a+b;
			System.out.println("Addition is :" +c);
			break;
		case '-':
			c=a-b;
			System.out.println("Subtraction is :" +c);
			break;
		case '*':
			c=a*b;
			System.out.println("Multiplication is :" +c);
			break;
		case '/':
			c=a/b;
			System.out.println("Division is :" +c);
			break;
		default:
			System.out.println("no method");
			break;
		}
		System.out.println("press y to continue or press any key to exit");
		ch=sc.next().charAt(0);
	
	    
	    }
	    while(ch=='y'||ch=='Y');
	
	    }
	
	}


