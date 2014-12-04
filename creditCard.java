import java.util.*;

public class CreditCard
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double interestRatePlatinum = .02;
		double interestRateGold = .025;
		double interestRateSilver = .03;
		double creditCardBalance = 0.00;
		double minimumPayment = 0.00;
		double paymentToPrinciple = 0.00;
		double totalPayment = 0.00;
		double percentToPrinciple = .03;
		double percentToInterest = 0.00;
		double lateFee = 25.00;
		String customerName, creditCardLevel, latePayment;
		
		System.out.println("Thatcher Gillespie");
		System.out.println("Section .005");
		System.out.println("Credit Card Program");
		
		System.out.println("Please type in Customer Name: ");
		customerName = keyboard.next();
		
		System.out.println("Please choose credit card level, Platinum, Gold or Silver: ");
		creditCardLevel = keyboard.next();
		
		System.out.println("What is the credit card balance: ");
		creditCardBalance = keyboard.nextDouble();
		
		System.out.println("Will the payment be late, yes or no: ");
		latePayment = keyboard.next();
			
		
		if(creditCardLevel.equals("platinum"))
			{	
				if(latePayment.equals("yes"))
					{
						minimumPayment = (.025 * creditCardBalance) + (creditCardBalance * interestRateGold);
					}
				else if(latePayment.equals("no"))
					{
						minimumPayment = (.02 * creditCardBalance) + (creditCardBalance * interestRatePlatinum);
					}		
			}
		if(creditCardLevel.equals("gold"))
			{
				if(latePayment.equals("yes"))
					{
						minimumPayment = (.03 * creditCardBalance) + (creditCardBalance * interestRateSilver);
					}
				else if(latePayment.equals("no"))
					{
						minimumPayment = (.025 * creditCardBalance) + (creditCardBalance * interestRateGold);
					}	
			}
		if(creditCardLevel.equals("silver"))
			{
				if(latePayment.equals("yes"))
				{
					minimumPayment = (.03 * creditCardBalance) + lateFee +(creditCardBalance * interestRateSilver);
				}
				else if(latePayment.equals("no"))
				{
					minimumPayment = (.03 * creditCardBalance);
				}	
			}
			
		percentToInterest = 1-((creditCardBalance * percentToPrinciple)/ minimumPayment);
		 double percentToPre = (creditCardBalance * percentToPrinciple)/ minimumPayment;
		System.out.println("Billing Information for: " + customerName);
		System.out.println("Customer Level: " + creditCardLevel);
		System.out.printf("Credit Card Balance: $ " + creditCardBalance);
		System.out.println();
		System.out.printf("Required Minimum Payment: $ %.2f", minimumPayment);
		System.out.println();
		System.out.printf("Amount Going to Principal: $ %.2f ",(creditCardBalance * percentToPrinciple));
		System.out.println();
		System.out.printf("Percent to Principal: %.2f ", percentToPre*100);
		System.out.println();
		System.out.printf("Percent to Interest: %.2f ", percentToInterest*100);
	}	
}			
