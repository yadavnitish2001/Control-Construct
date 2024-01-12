import java.util.Scanner;

public class Calculater {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the first number");
	double a=sc.nextDouble();
	
	System.out.println("Enter the second number");
	double b=sc.nextDouble();
	
	System.out.println("Enter the charecter");
	char c=sc.next().charAt(0);
	
	if(c=='+')
	{
	System.out.println("Addition is :"+(a+b));
	}
	else if(c=='-')
	{
		if(a>b)
		{
	      System.out.println("Substraction is :"+(a-b));
		}
		else {
			System.out.println("Substraction is :"+(b-a));
		}
	}
	else if(c=='*')
	{
		System.out.println("multiplication is :"+(a*b));
	}
	else if(c=='/') {
		if(a>b) {
			System.out.println("Division is:"+(a/b));
		}
		else {
			System.out.println("Division is :"+(b/a));
		}
	}
}
}
