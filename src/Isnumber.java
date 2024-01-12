import java.util.Scanner;

public class Isnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number");
		int a= sc.nextInt();
		
		if(a>0)
		{
			System.out.println("The number is positive");
		}
		else if(a<0) 
		{
			System.out.println("The number is negative");
			
		}
		else {
			System.out.println("The number is Zero");
		}

	}

}
