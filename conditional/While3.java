package conditional;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int original=n;
		int result=0;
		int digit =0;
		while(original != 0) {
			digit++;
			original /=10;
	}original=n;
	while(original != 0) {
		int digits = original%10;
		result += Math.pow(digits, digit);
		original /= 10;
		}
	if(result==n) {
		System.out.println("Armstrong number");
	}
	else {
		System.out.println("Not Armstrong number");
	}
	}
}
