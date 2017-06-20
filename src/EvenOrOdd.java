//This class determines whether the number entered is even or odd.
import java.util.Scanner;
public class EvenOrOdd 
{
	public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0)
			System.out.println("The number is even!");
		else
			System.out.println("The number is odd!");	
		sc.close();	
	}	
}