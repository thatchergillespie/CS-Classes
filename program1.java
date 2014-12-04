import java.util.Scanner;
	public class Program1
	{
		public static void main(String[] args)
		{
		
		String name;
		String major;
		double salary;
		
		
		System.out.println("Program 1 by Thatcher Gillespie\n");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = scan.nextLine();
		
		System.out.println("What is your major?");
		major = scan.nextLine();
		
		System.out.println("How much money would you like to make per year?");
		salary = scan.nextDouble();
		
		System.out.print("\n" + name + " is majoring in " + major);
		System.out.print(" and would like to make $");
		System.out.println(salary + " per year.");
		}
	
	}

	
	
	
