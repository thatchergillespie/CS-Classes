import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Calculator
{
	public static void main(String args[])
	{
		System.out.println("Thatcher Gillespie Section .005 Calculator Program 5");
		
		Scanner scan = new Scanner(System.in);
		HashMap<String,Double> var = new HashMap<>();
		Stack<Double> stack = new Stack<>();
		
		while(true)
		{
			System.out.print("% ");
			String s = scan.nextLine();
			
			if(s.equals("quit"))
			{
				System.exit(0);
			}
			else if(s.equals("var"))
			{
				System.out.println(var);
				continue;
			}
			else if(s.equals("clear"))
			{
				var.clear();
				continue;
			}
			String[] sArray = s.split(" ");
			String varName = null;
			int start = 0;
			if(sArray.length > 2 && sArray[1].equals("=")) 
			{
				varName = sArray[0];
				start = 2;
			}
			
			for(int i=start; i< sArray.length; i++)
			{
				Scanner sscan = new Scanner(sArray[i]);
				if(sscan.hasNextDouble())
				{
					stack.push(sscan.nextDouble());
				}
