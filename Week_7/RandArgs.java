/* Filename: RandArgs
 * Author: Reginald Mace
 * Date: October 6, 2016
 * Purpose: To use command-line arguments to generate random numbers
 */

public class RandArgs {
	public static void main(String []args){
		// Variables that for command-line arguments	
		int x = 0;																						
		int y = 0;					
		// Verifies that the command-line arg exist if not an error message is provided
		if (args.length != 2){							
			System.err.println("\tInvalid Entry. A command line argument is required " + 
			" for this application. \n\n" + "Example: java Arguments 4 5");
			System.exit(0);
			
			} else // If the argument exist it is converted to int, and confirms selection to user.
		
			if (args.length == 2){  					
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			System.out.println("\tYou have selected the numbers " + args[0] + 
			" and "  + args[1] + "\n\n" + "Here are your random numbers:\n");
			// the for loop and Math.random method generates random numbers whose range is determined
			// by Math.random * y the or the second argument that was entered. 'x' determines the length of the loop
			for (int i = 0; i <= x; i++){				
			int random = (int)(Math.random () * y);		
			System.out.println("args [" + i + "]" + " value is:" + "\t" + random);
			}
		}
	}
}
			
		
		

