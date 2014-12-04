import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Compress
{
	public static String encode(String source)
	{
		StringBuffer dest = new StringBuffer();
		
		for (int i = 0; i < source.length(); i++)
		{
			int runLength = 1;
			
			while(i+1 < source.length() && source.charAt(i) == source.charAt(i+1))
			{
				runLength++;
				i++;
			}
			dest.append(runLength);
			dest.append(source.charAt(i));
		}
		return dest.toString();
	}

	public static String decode(String source)
	{
		StringBuffer dest = new StringBuffer();
		Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]");
		Matcher matcher = pattern.matcher(source);
		while(matcher.find())
		{
			int number = Integer.parseInt(matcher.group());
			matcher.find();
			while(number-- != 0)
			{
				dest.append(matcher.group());
			}
		}
		return dest.toString();
	}

	public static void main(String[] args)
	{
		if(args.length==0 || (!args[0].equals("-c") && !args[0].equals("-d")))
		{
		System.out.println("Compression program, Thatcher Gillespie");
		System.out.println("usage: java Compress [-c, -d] < inputFile > outputFile");
		System.exit(0);
		}
		if(args[0].equals("-c"))
		{
			Scanner keyboard = new Scanner(System.in);
			String c;
			c = keyboard.nextLine();
			System.out.println(encode(c));
		}
		if(args[0].equals("-d"))
		{
			Scanner keyboard = new Scanner(System.in);
			String d;
			d = keyboard.nextLine();
			System.out.println(decode(d));
		}
	}
}	
