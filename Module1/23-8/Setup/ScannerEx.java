import java.util.Scanner;

public class ScannerEx 
{
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your ID");
		int id=sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name=sc.next();
		
		
		System.out.println("Enter Your Salary");
		double salary =sc.nextDouble();
		
		System.out.println("Your id is : "+id);
		System.out.println("Your name is : "+name);
		System.out.println("Your salary is : "+salary);
		
		
	}
}
