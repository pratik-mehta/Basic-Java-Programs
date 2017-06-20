//This class determines whether the number entered is prime or not.
import java.util.Scanner;
public class Prime 
{
	public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0)
			System.out.println("0 is not a prime number!");
		else if(n%2==0)
			System.out.println("The number is not prime, it is divisible by 2!");
		else if(n%3==0)
			System.out.println("The number is not prime, it is divisivle by 3!");
		else if(n%5==0)
			System.out.println("The number is not prime, it is divisivle by 5!");
		else if(n%7==0)
			System.out.println("The number is not prime, it is divisivle by 7!");
		else
			System.out.println("The number is prime!");
		sc.close();
	}
}