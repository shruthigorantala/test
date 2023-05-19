package conditional;

import java.util.Scanner;

public class Dowhileeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
	    char ch;
	    Scanner sc=new Scanner(System.in);
	    do {
		System.out.print("Enter 2 numbers :");
		a = sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is :" +c);
		System.out.println("press y to continue or press any key to exit");
		ch=sc.next().charAt(0);
	}
	while(ch=='y'||ch=='Y');
	
}
}
