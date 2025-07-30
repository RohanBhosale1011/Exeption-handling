import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {
		try {
		Scanner s= new Scanner(System.in);
		System.out.println(" enter the frist element ");
	 int a= s.nextInt();
	 System.out.println(" enter the second number ");
	 int b = s.nextInt();
	 System.out.println("addition of frist and second number is "+(a+b));
	 System.out.println("subtractiomn of two number is "+(a-b));
	 System.out.println("multiplication of two number is "+(a*b));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}
}
