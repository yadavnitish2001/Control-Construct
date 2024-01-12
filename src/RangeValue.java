import java.util.Scanner;

public class RangeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter the number");
		 int a=sc.nextInt();
		 
		 if(a>=0 && a<=10) {
			 System.out.println("The number is in RANGE 1");
		 }
		 else if(a>=11 && a<=20) {
			 System.out.println("The number is in RANGE 2");
		 }
		 else if(a>=21 && a<=30) {
			 System.out.println("The number is in RANGE 3");
		 }
		 else if(a>=31 && a<=40) {
			 System.out.println("The number is in RANGE 4");
		 }
		 else if(a>=41 && a<=50) {
			 System.out.println("The number is in RANGE 5");
		 }
		 else {
			 System.out.println("The number is not in range");
		 }
	}

}
