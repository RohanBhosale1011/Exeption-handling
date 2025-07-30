import java.util.InputMismatchException;
import java.util.Scanner;

public class StringException {
	public static void main(String[] args) {
		try {
	Scanner sc= new Scanner(System.in);
			System.out.println("enter your frd");
			String str = sc.next();
	System.out.println(" enter the index of character");
	int index = sc.nextInt();
			System.out.println("character at index is "+str.charAt(index));
		

}
		catch(InputMismatchException e1){
			System.out.println(e1.getMessage());
			
			}
		catch(Exception e2) {
			System.out.println(e2.getMessage());
		}
		}
}