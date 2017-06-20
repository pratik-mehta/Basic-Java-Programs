//This class reverses an entered string.
import java.util.Scanner;
public class StringReverse 
{
	public static void main(String args[])
	{
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] array = str.toCharArray();		//convert string to an array
		for(int n=array.length-1;n>=0;n--)
		{
			System.out.print(array[n]);
		}
		sc.close();
	}
}