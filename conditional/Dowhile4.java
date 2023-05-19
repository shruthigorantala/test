package conditional;

import java.util.Scanner;

public class Dowhile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice,ch;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter char value:");
		ch=sc.next().charAt(0);
		switch (ch) {
		case 'a':	
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+ "is Vowel");
			break;
		
		default:
			System.out.println(ch+ " is Constant");
			break;

	}System.out.println("press y to continue or press any key to exit");
	ch=sc.next().charAt(0);
}
while(ch=='y'||ch=='Y');

}

}
