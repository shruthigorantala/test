package conditional;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int n,sum=0,rem=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a number");
				n=sc.nextInt();
				while(n>0) {
					rem=n%10;
					sum=sum+rem;
					n=n/10;}
					System.out.println(""+sum);
				

	}

}
