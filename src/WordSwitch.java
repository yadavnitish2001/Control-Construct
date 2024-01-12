import java.util.Scanner;

public class WordSwitch {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
	
		switch(num)
		{
		case 1:System.out.println("The number is ONE");
		        break;
		        
		case 2:System.out.println("The number is TWO");
        break;
        
		case 3:System.out.println("The number is THREE");
        break;
        
		case 4:System.out.println("The number is FOUR");
        break;
        
		case 5:System.out.println("The number is FIVE");
        break;
}
	}
}
