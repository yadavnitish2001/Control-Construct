import java.util.Scanner;

public class Charecter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  charecter");
		char c= sc.next().charAt(0);
		
		if(c>='A'&& c<='Z')
		{
			System.out.println("It is uppercase letter");
		}
		else if(c>='a'&& c<='z') 
		{
			System.out.println("It is lowerCase letter");
			
		}
		else if(c>='0'&& c<='9') {
			System.out.println("It is a number");
		}
		else {
			System.out.println("It is a Special charecter case");
		}

	}

}
