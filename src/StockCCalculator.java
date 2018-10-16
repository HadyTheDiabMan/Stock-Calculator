import java.util.Scanner;

/**
 * 
 * @author Hady Diab
 *
 */
public class StockCCalculator
{

	public static void main(String[] args) 
	{
Scanner calculator =new Scanner (System.in);
System.out.println("THE STOCK CALCULATOR!");
System.out.print("Hit enter to continue...");
calculator.nextLine();
System.out.print("\nThe number of shares purchased: ");
String sharesPurchasedstr= calculator.nextLine();
System.out.print("\nThe price paid per share: ");
String sharescostStr=calculator.nextLine();
System.out.print("\nEnter in the commission rate to be paid to the stockbroker for the purchase, as a decimal: ");
String buycommisionStr=calculator.nextLine();
System.out.print("\nEnter in the price per share the stocks were sold for: ");
String sellpriceStr=calculator.nextLine();
System.out.print("\nEnter in the commision rate to be paid to the stockbroker for the sale, as a decimal: ");
String sellcommisionStr=calculator.nextLine();

int sharespurchased= Integer.parseInt(sharesPurchasedstr);
double sharescost= Double.parseDouble(sharescostStr);
double buycommision= Double.parseDouble(buycommisionStr);
double sellprice=Double.parseDouble(sellpriceStr);
double sellcommision=Double.parseDouble(sellcommisionStr);

double amountpaidstocks= sharespurchased*sharescost;

double commissionpurchase= amountpaidstocks*buycommision;

double amountsoldstocks= sellprice*sharespurchased;

double commissionsell= amountsoldstocks*sellcommision;

double netgainloss= amountsoldstocks-amountpaidstocks-commissionpurchase-commissionsell;

System.out.println("RESULTS:");
System.out.print("\nTotal paid for "+sharespurchased+" shares: $"+amountpaidstocks);
System.out.print("\nCommision on purchase: $"+ commissionpurchase);
System.out.print("\nTotal sale price for " +sharespurchased+ " : $"+amountsoldstocks );
System.out.print("\nCommision on sale: $"+commissionsell);
System.out.print("\nNet gain/loss: $"+netgainloss);







	
	}


}
