package conditional;
import java.util.Scanner;
public class Oddno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int p=i*(i+1);
			sum += p;
			System.out.print(i+"*"+(i+1)+ "+" );
			
		}
     System.out.print("="+sum);
	}

}
