package conditional;

import java.util.Scanner;

public class Dowhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,num,ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value:");
		num=sc.nextInt();
		do {
		System.out.println("Enter your choice: 1 or 2");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			if(num%2==0) {
			System.out.println("Even");}
			else {
				System.out.println("odd");
			}
			break;
		case 2:
			if(num<0) {
			System.out.println("Negative");}
			else if(num>0) {
				System.out.println("positive");}
			else {
				System.out.println("Zero");
			}
			break;
		default:
			System.out.println("NO method");
			break;
		}
		System.out.println("press y to continue or press any key to exit");
		ch=sc.next().charAt(0);
	}
	while(ch=='y'||ch=='Y');
	

	}

}
