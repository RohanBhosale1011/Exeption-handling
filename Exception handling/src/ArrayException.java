import java.util.*;
class ArrayException {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
int[]number =new int [10];
try {
	System.out.println("enter the 10 element  ");

for(int i=0;i <10;i++) {
	number [i]=sc.nextInt ();
}
System.out.println("enetr the index of fetch element");
int index= sc.nextInt();

	System.out.println("element at index "+index+":"+ number[index]);
}
catch(Exception e) {
	System.out.println(e.getMessage());
	

}
}
}
