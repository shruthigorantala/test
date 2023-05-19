package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAddition {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers :");
		a = Integer.parseInt(reader.readLine());
		b = Integer.parseInt(reader.readLine());
		c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is :" +c);
		c=a-b;
		System.out.println("Subtraction of "+a+" and "+b+" is :" +c);
		c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is :" +c);
		c=a/b;
		System.out.println("Division of "+a+" and "+b+" is :" +c);


	}

}
