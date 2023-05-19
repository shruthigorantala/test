package conditional;
import java.util.Scanner;

public class vowelorconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		ch = sc.next().charAt(0);
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) {
			System.out.println(" "+ch+" is a vowel");	
		}
		else {
			System.out.println(" "+ch+" is a constant");
		}

	}

}
