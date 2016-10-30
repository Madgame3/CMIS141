/* 
 * File: TV.java
 * Author: Luke Wiley
 * Date: September 29, 2016
 * Purpose: Create Java class for a household object
 */
 
 public class TV {
 
    private int channel = 0;
    private int volume = 0;
    private boolean onOff = false;
    
    // Default constructor
    public TV (){
        channel = 0;
        volume = 0;
        onOff = false;
    }
    
    // constructor
    public TV(int c, int v, boolean o){
        channel = c;
        volume = v;
        onOff = o;
    }
    
    // getter methods
    public int getChannel(){
        return channel;
    }
    
    public int getVolume(){
        return volume;
    }
     
    public boolean getOnOff(){
        return onOff;
    }
 }
 