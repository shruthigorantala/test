package basic;
import java.util.Scanner;
public class ScannerAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary, tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("Salary of employee:");
		salary= sc.nextInt();
		tax=(salary*12)/100;
		System.out.println("12% tax of the salary is:"+ tax);
	
		
	}

}
