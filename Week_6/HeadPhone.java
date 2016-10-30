//Author: Stephen Harrington
//Date: 2 October 2016
//Purpose: Creating HeadPhone Class
import java.awt.Color;

public class HeadPhone {
    //create private variables
    private int volume;
    private boolean pluggedIn;
    private String manufacturer;
    private Color headPhoneColor;
    
    //other variables
    String volumeString;
    String description;
    int value;
    
    //create constants
    public final int LOW = 1;
    public final int MEDIUM = 2;
    public final int HIGH = 3;
    
    // Default constructor
    public HeadPhone (){
        volume = 2;
        pluggedIn = false;
        manufacturer = "Bose";
        headPhoneColor = headPhoneColor.black;
    }
    
    // constructor
    public HeadPhone(int volume, boolean pluggedIn, String manufacturer, Color color){
        this.volume = volume;
        this.pluggedIn = pluggedIn;
        this.manufacturer = manufacturer;
        this.headPhoneColor = color;
    }
    
    // getter methods
    public String getVolume(){
        if(volume == LOW){
            volumeString = "Low";
        }
        if(volume == MEDIUM){
            volumeString = "Medium";
        }
        if(volume == HIGH){
            volumeString = "High";
        }
        return volumeString;
    }
    
    
     public boolean getPluggedIn(){
        return pluggedIn;
    }
     
    public String getManufacturer(){
        return manufacturer;
    }
    public String getHeadPhoneColor(){
        return  headPhoneColor.toString();
    }

    public String toString() {
        
        description = "Volume is currently set to : " + this.getVolume();
        description += "\nHeadPhones are plugged in: " + Boolean.toString(this.pluggedIn);
        description += "\nHeadPhones manufacter is: " + this.manufacturer;
        description += "\nHeadPhones are : " + this.headPhoneColor.toString();
        return description;
    }
    
     
    //setter methods
    public void changeVolume(int value){
        this.volume = value;
    }
    
    public void setPluggedIn(boolean value){
        this.pluggedIn = value;
    }
    
    public void setManufacturer(String value){
        this.manufacturer = value;
    }
    
    public void setColor(Color value){
        this.headPhoneColor = value;
    }
    
}