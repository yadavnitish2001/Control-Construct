import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	
		
		System.out.println("Enter the name");
		String name=sc.next();
		name=name.toUpperCase();
		
		switch(name){
			case"AJAY":
				System.out.println(name+ " lives in DELHI " );
			           break;
			           
			case"ANKIT":System.out.println(name+ " lives in MUMBAI " );
	           break;
	           
			case"AKASH":System.out.println(name+ " lives in HYDERABAD");
	           break;
	           
			case"ARJUN":System.out.println(name+ " lives in BANGALORE" );
	           break;
	           
	           default:System.out.println(name+ " lives in INDIA ");
		           
		}

	}

}
