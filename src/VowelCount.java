//This program counts the number of vowels in an entered string.
import java.util.Scanner;
public class VowelCount 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		char[] array = str.toCharArray();
		int count = 0;
		for(int n=0;n<array.length;n++)
		{
			if(array[n]=='a'||array[n]=='e'||array[n]=='i'||array[n]=='o'||array[n]=='u')
				count++;
		}
		System.out.println("The number of vowels in the string is "+count);
		sc.close();
	}
}
