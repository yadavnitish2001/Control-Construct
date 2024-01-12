import java.util.Scanner;

public class VoteApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of person");
		int age=sc.nextInt();
		
		if (age>=18)
		{
			System.out.println("person is eligible for voting");
		}
		else {
			System.out.println("person is not eligible for voting");
		}
			
	}

}


