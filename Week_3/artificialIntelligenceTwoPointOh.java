//import java.util.*;

public class artificialIntelligenceTwoPointOh
{
  public static void main(String args[])
	  {
	   Scanner input = new Scanner(System.in);

	   int rgn = (int) (Math.random() * 99);
	   System.out.println("The Random Number is " + rgn);	
	   int userInput; 
	   int tries = 0;
	   int highScore = 2;

	   System.out.println("How many tries will it take you to guess the amount of Jelly Beans in my RNJar? Can you beat my highscore of 2?");

	   while((userInput = input.nextInt()) != rgn){
		 if (userInput > rgn && userInput < 100 ){  
				System.out.println("too many!");
			}
		  if(userInput < rgn && userInput < 100){
				System.out.println("too few!");
			}
		  if (userInput > 100 ){
				System.out.println("Whooa, easyyy. There aren't more than 100 beans in the jar");
			}
		  if  (userInput < 0 ){
				 System.out.println("How can you have negative jelly beans? Stop trying to break my program!");
			}
     tries++;
   }

   System.out.print("Correct you guessed " + rgn + " in " + tries + " tries. "); //Play again to get a better score!!");
   {
		 if (tries > highScore){  
				System.out.println("LOOOOOOSER!!!!! TRY AGAIN!!!");
			}
		 else{
				System.out.println("Awww :( You beat me");
			}
  }

 }
}
