//Author: Stephen Harrington
//Date: 2 October 2016
//Purpose: Create your own class

public class Fan {
    private boolean isOn = false;
    private boolean oscilating = false;
    private int speed = 0;
    private int timer = 0;
    
    // more variables
    String results = "";
    String onOrOff = "";
    String isFast = "";
    String isMoving = "";
    String isTimed = "";
    
    
    
    // Default constructor
    public Fan (){
        timer = 0;
        speed = 0;
        isOn = false;
        oscilating = false;
    }
    
    // constructor
    public Fan(int a, int b, boolean c, boolean d){
        timer = a;
        speed = b;
        isOn = c;
        oscilating = d;
    }
    
    // getter methods
    public int getTimer(){
        return timer;
    }
     public int getSpeed(){
        return speed;
    }
     
    public boolean getIsON(){
        return isOn;
    }
    public boolean getOscilating(){
        return oscilating;
    }
    public String toString() {
            if(isOn){
                onOrOff = "The Fan is on,";
                if(speed > 5){
                    isFast = "it is blowing on high,";
                }
                else {
                    isFast = "it is blowing on low,";

                }
                if (oscilating){
                    isMoving = "it is oscilating,";
                }
                else {
                    isMoving = "it is not oscilating,";
                }
                if (timer > 0){
                    isTimed = "and is set to turn off in " + timer + " minutes.";
                }
                else{
                    isTimed = "and no timer is set";
                }
                 results = onOrOff + isFast + isMoving + isTimed; 
                
            } else{
                    results = "The Fan is not on";
            }
            
            return results;
    }
    
       
    //setter methods
    public void setTimer(int value){
        this.timer = value;
    }
    
    public void setSpeed(int value){
        this.speed = value;
    }
    
    public void setOnOff(boolean value){
        this.isOn = value;
    }
    
    public void setOscilating(boolean value){
        this.oscilating = value;
    }
    
    
}