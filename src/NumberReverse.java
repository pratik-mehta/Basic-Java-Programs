//This class reverses an entered number.
import java.util.Scanner;
public class NumberReverse 
{
	public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
			System.out.println("Please enter a positive number!");
		else
			while(n>0)
			{
				System.out.print(n%10);			
				n=n/10;
			}
		sc.close();
	}
}