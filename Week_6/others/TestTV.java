/* 
 * File; TestTV.java
 * Author: Luke Wiley
 * Date: September 29, 2016
 * Purpose: To create instances of TV
 */

 
 public class TestTV{
    public static void main(String[] args){
    
    // Construct default TV
    TV tvOne = new TV();
    
    // Call methods
    System.out.println("Is TV on? " + tvOne.getOnOff());
    System.out.println("Channel: " + tvOne.getChannel());
    System.out.println("Volume level: " + tvOne.getVolume());
    
    // Construct another TV 
    TV tvTwo = new TV(5,13,true);
    
    System.out.println("Is TV on? " + tvTwo.getOnOff());
    System.out.println("Channel: " + tvTwo.getChannel());
    System.out.println("Volume level: " + tvTwo.getVolume());
    
    }
 }