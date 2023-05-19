package conditional;

public class Breakeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("use of break:");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			if(i==5)
				break;
		}
		System.out.println("\n\nuse of continue:");
		for(int j=1;j<=10;j++) {
			if(j==5) {
				continue;
			}
			System.out.print(j+" ");
		}

	}

}
