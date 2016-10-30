/*Filename: XRandom 
*Author: Stephen Harrington
*Date: October 9th 2016
*Purpose: Create your own simple Java application to generate X random Integer values between 0 and Y. Use command line arguments for entry of X and Y. emonstrate your code compiles and runs without issue using screen captures as appropriate.
*/
public class XRandom {
    public static void main(String []args){
        //Create Variables for Command-Line Arguments
        int x;
        int y;
        //Ensures there are 2 argunments being passed
        if(args.length !=2){
            System.err.println("\n\tError: Please incluce 2 command-line arguments" +
                    "\n\n\tExample: java XRandom 15 10");
            //404 argument not found, with a picture of a cat?
            System.exit(404);
        }
        if(args.length == 2){
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            for (int i = 0; i < x; i++){                
                int random = (int)(Math.random () * y);        
                System.out.println("Random #" + i + " = " + random);
            } 
        }
    }
}