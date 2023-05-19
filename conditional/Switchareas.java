package conditional;

import java.util.Scanner;

public class Switchareas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,b,r,h,choice;
		double circle,rectangle,triangle;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: 1-circle, 2-rectangle, 3-triangle");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter r values:");
			r=sc.nextInt();
			circle=(22/7)*r*r; 
			System.out.println("Area of circle :"+circle);
			break;
		case 2:
			System.out.println("Enter l,b values:");
			l=sc.nextInt();
			b=sc.nextInt();
			rectangle=l*b;
			System.out.println("Area of rectangle"+rectangle);
			break;
		case 3:
			System.out.println("Enter b,h values:");
			b=sc.nextInt();
			h=sc.nextInt();
			triangle=(b*h)/2;
			System.out.println("Area of triangle:"+triangle);
			break;
		default:
			System.out.println("NO method");
			break;
		}

	}

}
