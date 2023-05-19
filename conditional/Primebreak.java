package conditional;

import java.util.Scanner;

public class Primebreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=2,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		num = sc.nextInt();
		while(i<num) {
			if(num%i==0) {
				count++;
				break;}
			i++;
			}
		if(count==0)
			System.out.println("\n" +num+ "is a prime number");
		else {
			System.out.println("\n" +num+ "is not a prime number");
		}

	}

}
