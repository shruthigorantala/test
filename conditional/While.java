package conditional;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		while(n>0) {
			m=n%10;
			sum=sum*10+m;
			n=n/10;}
			System.out.println("Reverse of number is:"+sum);
		

	}

}
