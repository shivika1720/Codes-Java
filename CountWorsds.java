import java.io.*;
import java.util.*;
public class CountWords
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str;
		char ch;
		int l,i,w=0;
		System.out.println("Enter the paragrapgh");
		str= in.nextLine();
		l=str.length();
		for(i=0;i<l;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				w++;
			}
		}
	
	w=w+1;
	System.out.println("Actual Sentence: "+str);
	System.out.println("No.of Words: "+w);
  }
}
