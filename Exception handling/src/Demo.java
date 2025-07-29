import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter thr string value");
		String str = sc.next();
		System.out.println(str.charAt(22));
	}
	catch(Exception e ) {
		System.out.println(" invalid index no please check your string length ");
	}
	finally {
		
		System.out.println("code executed perfectly");
	}
}
}
