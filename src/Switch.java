import java.util.Scanner;

public class Switch {

public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the first number");
	double a=sc.nextDouble();
	
	System.out.println("Enter the second number");
	double b=sc.nextDouble();
	
	System.out.println("Enter an operation to be performed");
	char c=sc.next().charAt(0);
	
	switch(c)
	{
	case '+':System.out.println("Additon is :"+(a+b));
	        break;
	
	case '-':if(a>b)
	{
		System.out.println("Substraction is :"+(a-b));
        break;
	}
	  else {
		  System.out.println("Substraction is:"+(b-a));
		  break;
	  }
	case '*':System.out.println("Multiplication is :"+(a*b));
	         break;
	
	case '/':if(a>b)
	{
		System.out.println("Division is :"+(a/b));
        break;
	}
	  else {
		  System.out.println("Division is:"+(b/a));
		  break;
	  }
	         
	default:System.out.println("Invalid input");
	}
}
}
