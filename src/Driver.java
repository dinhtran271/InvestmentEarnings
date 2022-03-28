import java.util.Scanner;
import java.text.DecimalFormat;
/*
- Enter the buying price per share
- Enter closing price on subsequent days
- Calculate aggregate earnings/losses after each day
- Leave program when closing price is negative value */

public class Driver {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your buying price per share: ");
		double buyingPrice = scan.nextDouble();
		DecimalFormat df = new DecimalFormat("#.##");
		int day = 1; 
		double closingPrice = 0.1;
		while (true) {
			System.out.print("Enter the closing price for day " + day + ": ");
			closingPrice = scan.nextDouble();
			if (closingPrice < 0) break;
			double earnings = closingPrice - buyingPrice;
			if (earnings > 0) 
				System.out.println("After day " + day + ", you earned " + df.format(earnings) + " per day.");
			else if (earnings < 0)
				System.out.println("After day " + day + ", you lost " + df.format(-earnings)+ " per day.");
			else 
				System.out.println("After day " + day + ", you have no earnings per share.");
			day++;
		}
		scan.close();
	}
}   
