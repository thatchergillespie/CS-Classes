import java.util.Scanner;

	public class BankAccount
	{
		
		static int BankAccountTotal;
		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			double accountBalance;
			String accountName;
			
		  System.out.println("Please name the account: ");
		  accountName = keyboard.nextLine();
		
		  System.out.println("Please enter amount in the account: ");
		  accountBalance = keyboard.nextDouble();
		  
		  System.out.println(accountName +  " $" + accountBalance);
		}
	}	
		  
