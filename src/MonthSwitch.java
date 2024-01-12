import java.util.Scanner;

public class MonthSwitch {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the month's number to print the month's Name");
		int month=sc.nextInt();
	
		switch(month)
		{
		case 1:System.out.println("Month is January s");
		        break;
		        
		case 2:System.out.println("Month is February ");
                break;
                
		case 3:System.out.println("Month is March ");
                 break;
        
		case 4:System.out.println("Month is April ");
                 break;
        
		case 5:System.out.println("Month is May ");
                 break;
        
		case 6:System.out.println("Month is June ");
                 break;
        
		case 7:System.out.println("Month is July ");
                 break;
        
		case 8:System.out.println("Month is August ");
                 break;
        
		case 10:System.out.println("Month is September ");
                 break;
        
		case 11:System.out.println("Month is November");
                  break;
                  
		case 12:System.out.println("Month is December ");
                  break;
       
		default:System.out.println("Invalid input");
		}
	}
}
