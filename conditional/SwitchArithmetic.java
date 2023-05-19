package conditional;
import java.util.Scanner;
public class SwitchArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		char choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter your choice");
		choice = sc.next().charAt(0);
		switch (choice) {
		case '+':
			c=a+b;
			System.out.println("Addition is:"+c);
			break;
		case '-':
			c=a-b;
			System.out.println("Subraction is:"+c);
			break;
		case '*':
			c=a*b;
			System.out.println("Multiplication is:"+c);
			break;
		case '/':
			c=a/b;
			System.out.println("Division is:"+c);
			break;
		default:
			System.out.println("no option");
			break;
		}
	}
		

	}


