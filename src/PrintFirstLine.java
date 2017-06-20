//This program prints the first line in an entered file.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class PrintFirstLine 
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("/Users/PM/EclipseProjects/BasicJavaPrograms/src/File.txt");
		BufferedReader br = new BufferedReader(fr);
	    String text;
		text = br.readLine();
	    System.out.println("Firstline is : " + text);
	    br.close();
	}
}
