import java.util.Scanner;

public class Substraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("Substraction is :"+(a-b));
		}
		else {
			System.out.println("Substraction is :"+(b-a));
			
		}
	}

}
