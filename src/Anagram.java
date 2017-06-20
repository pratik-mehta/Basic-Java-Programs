//This program check whether the 2 entered strings are anagrams or not.
import java.util.Arrays;
import java.util.Scanner;
public class Anagram 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter another string: ");
		String str2 = sc.nextLine();
		String s1 = str1.replaceAll("\\s", "");		//remove whitespace
		String s2 = str2.replaceAll("\\s", "");		//remove whitespace
		if(s1.length()!=s2.length())				//check if lengths are equal
			System.out.println("These are not anagrams");
		else
		{
			char[] array1 = s1.toLowerCase().toCharArray();		//convert to all lower case & convert string to an array
			char[] array2 = s2.toLowerCase().toCharArray();		//convert to all lower case & convert string to an array
			Arrays.sort(array1);	//sort array
			Arrays.sort(array2);	//sort array
			if(Arrays.equals(array1,array2))		//check if arrays are the same
				System.out.println("These are anagrams!");
			else
				System.out.println("These are not anagrams!");
		}
		sc.close();
	}
}
