/*Filename: StateLookup
*Author: Stephen Harrington
*Date: October 9th 2016
*Purpose: Display State Bird and Flower of any State
*/
import java.util.Scanner;//Import each required Java class
public class StateLookup {
    public static void main(String []args){
        String[][] stateInfo = {  //Create Array Multidimensional Array of States, Birds, and Flowers
            //States are [i][0], Birds are in [i][1], and Flowers are in [i][2]    
            {"Alabama", "Yellowhammer", "Camellia"},
            {"Alaska", "Willow Ptarmigan","Forget-me-not"},
            {"Arizona",	"Cactus Wren Saguaro", "Cactus Blossom"},
            {"Arkansas", "Mockingbird", "Apple Blossom"},
            {"California", "California Valley Quail", "Golden Poppy"},
            {"Colorado", "Lark Bunting", "Columbine"},
            {"Connecticut","American Robin", "Mountain Laurel"},
            {"Delaware", "Blue Hen Chicken", "Peach Blossom"},
            {"Florida",	"Mockingbird",	"Orange Blossom"},
            {"Georgia",	"Brown Thrasher", "Cherokee Rose"},
            {"Hawaii", "Nene", "Hibiscus"},
            {"Idaho", "Mountain Bluebird", "Syringa"},
            {"Illinois", "Cardinal","Native violet"},
            {"Indiana",	"Cardinal","Peony"},
            {"Iowa", "Eastern Goldfinch", "Wild Rose"},
            {"Kansas","Western Meadowlark", "Native Sunflower"},
            {"Kentucky","Kentucky Cardinal", "Goldenrod"},
            {"Louisiana","Pelican", "Magnolia"},
            {"Maine","Chickadee", "White Pine Cone and Tassel"},
            {"Maryland","Baltimore Oriole", "Black-Eyed Susan"},
            {"Massachusetts","Chickadee", "Mayflower"},
            {"Michigan","Robin", "Apple Blossom"},
            {"Minnesota","Common Loon",	"Pink and White Lady Slipper"},
            {"Mississippi","Mockingbird", "Magnolia"},
            {"Missouri", "Bluebird", "Hawthorn"},
            {"Montana",	"Western Meadowlark", "Bitterroot"},
            {"Nebraska","Western Meadowlark", "Goldenrod"},
            {"Nevada", "Mountain Bluebird", "Sagebrush"},
            {"New Hampshire", "Purple Finch", "Purple Lilac"},
            {"New Jersey", "Eastern Goldfinch",	"Purple Violet"},
            {"New Mexico", "Roadrunner", "Yucca Flower"},
            {"New York", "Bluebird",	"Rose"},
            {"North Carolina",	"Cardinal", "Dogwood"},
            {"North Dakota", "Western Meadowlark", "Wild Prairie Rose"},
            {"Ohio", "Cardinal", "Scarlet Carnation"},
            {"Oklahoma", "Scissor-Tailed Flycatcher", "Mistletoe"},
            {"Oregon", "Western Meadowlark", "Oregon Grape"},
            {"Pennsylvania", "Ruffed Grouse", "Mountain Laurel"},
            {"Rhode Island", "Rhode Island Red", "Violet"},
            {"South Carolina", "Carolina Wren",	"Yellow Jessamine"},
            {"South Dakota", "Ring-Necked Pheasant", "American Pasqueflower"},
            {"Tennessee", "Mockingbird", "Iris"},
            {"Texas", "Mockingbird", "Bluebonnet"},
            {"Utah", "California Gull",	"Sego Lily"},
            {"Vermont",	"Hermit Thrush", "Red Clover"},
            {"Virginia", "Cardinal", "Dogwood"},
            {"Washington", "Willow Goldfinch", "Western Rhododendron"},
            {"West Virginia", "Cardinal", "Big Rhododendron"},
            {"Wisconsin", "Robin", "Wood Violet"},
            {"Wyoming",	"Meadowlark",	"Indian Paintbrush"}
            };
        Scanner input = new Scanner(System.in); //create Scanner and Variable to hold Input
        String inputState = "";
        boolean flag = false ; //Flag is used to let user know no results were found
        while(inputState.compareToIgnoreCase("none")!=0){
            flag = false; //flag has to be set for each loop
            System.out.println("Enter a State or None to exit:");
            inputState = input.nextLine();
            inputState = inputState.trim(); //Removing leading and trailing whitespace
            if(inputState.compareToIgnoreCase("none")==0){ //Checking for "None"
                System.out.println("Goodbye!");
                System.exit(0);
            }
            for(int i=0; i<50; i++){
                if(inputState.compareToIgnoreCase(stateInfo[i][0])==0){ //Comparing User Input to State Info values(Case insensitive)
                   System.out.println("------------------------------------------");
                   System.out.println("State: " + stateInfo[i][0]);
                   System.out.println("Bird: " + stateInfo[i][1]);
                   System.out.println("Flower: " + stateInfo[i][2]);
                   System.out.println("------------------------------------------");
                   flag = true;//setting this flag to true, ignores the error below
                }
            }
            if(flag == false){ //prints error if the string didn't match any of the 50 states
                System.err.println("\n--------------------------------------------"
                +"\nError: No matching State, please check your spelling"
                +"\n---------------------------------------");
            }
        }
    } 
}
