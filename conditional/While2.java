package conditional;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int original=n;
		while(n != 0) {
			int digit=n%10;
			r=r*10+digit;
			n /=10;
		}
		if(original==r) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}
