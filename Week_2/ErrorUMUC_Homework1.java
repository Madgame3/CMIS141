//Import each required Java class
import java.util.Scanner;

/**
*Compounding Interest Calculator
*/
public class UMUC_Error{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the principal amount");
	int principlal = input.nextInt();
	System.out.println("Enter the interest amount .00-.9999");
	double rate = input.nextdouble();
	System.out.println("Enter the number of times it compounds yearly - 1,monthly - 12,daily - 365");
	short compounds = input.nextshort();
	System.out.println("Enter the number of years you want to invest for")	
	byte years = input.nextbyte();
	double total = principal*(Math.pow((1 + rate/compounds),(compounds*years)));
	System.out.println("Your investment will be worth " + total);
	}
}
