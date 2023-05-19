package conditional;

import java.util.Scanner;

public class Maxminum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int callno, bill;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter callno:");
		callno= sc.nextInt();
		if(callno<200) {
			bill=callno*1;
			System.out.println("Bill is:"+bill);
		}
		else  {
			bill=callno*3;
			System.out.println("Bill is:"+bill);
		}
	}
}
