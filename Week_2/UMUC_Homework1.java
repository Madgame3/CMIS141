//Import each required Java class
import java.util.Scanner;

/**
*HomeWork 1 for CMIS 141
*/
public class UMUC_Homework1{
//Program must be saved as UMUC_Homework1 in order to compile code
//No Global Variables to Declare
	public static void main (String[] args){

		//Create the Scanner, so that we can capture input from the Students
		Scanner input = new Scanner(System.in);

		//Ask Student EMPLID
		System.out.println("Enter your Student EMPLID (0-999999)");
		int studentEMPLID = input.nextInt();
				
		//Ask Student Quiz1 grade
		System.out.println("Enter your quiz1 percentage score (0-100.0) ");
		double quiz1 = input.nextDouble();
		
		//Ask Studen Quiz2 grade
		System.out.println("Enter your quiz2 percentage score (0-100.0) ");
		double quiz2 = input.nextDouble();
				

		//Ask Student there Age
		System.out.println("Enter your age (0-120)");
		byte age = input.nextByte();
		
		//Ask Student current Temperature
		System.out.println("Enter the current Temperature in degrees Fahrenheit: ");
		short temperature = input.nextShort();	

		//Celsius Calculations
		double celsius = (temperature-32)*.5556;


		//Output Students Information
		System.out.println("******Thank You for completing our survey ***************************");
		System.out.println("Student EMPLID: " + studentEMPLID);
		System.out.println("Quiz 1 Score: " + quiz1);
		System.out.println("Quiz 2 Score: " + quiz2);
		System.out.println("Average quiz score: " + (quiz1+quiz2)/2);
		System.out.print("Temperature in Celsius: " + celsius);
		System.out.println(Character.toChars(0x00B0));
		System.out.println("You are " + age);	
		System.out.println("*********************************************************************");


	}
}
