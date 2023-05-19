package conditional;
import java.util.Scanner;

public class license {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		age= sc.nextDouble();
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}

	}

}
