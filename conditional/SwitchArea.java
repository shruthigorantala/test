package conditional;

import java.util.Scanner;

public class SwitchArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value:");
		num=sc.nextInt();
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

	}

}
