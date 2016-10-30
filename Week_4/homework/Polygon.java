/*
* File: Polygon.java
* Author: Stephen Harrington
* Date: September 18, 2016
* Purpose: This program creates the polygon class and defines there methods
*/
public class Polygon {
    
    //Declare variables for default value
    private int numSides = 4;
    private double sideLength = 10.0;
    private double xCoord = 0.0;
    private double yCoord = 0.0;
    private double apothem = 5.0;
    private double perimeter = 20.0;
    
    //Declare Constructor, used to create objects
    public Polygon(int numSides, Double sideLength, Double xCoord, Double yCoord, Double apothem){
        this.numSides = numSides;
        this.sideLength = sideLength;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.apothem = apothem;           
    }
    
    public Polygon(){
        this.numSides = numSides;
        this.sideLength = sideLength;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.apothem = apothem;           
    }
    //Getter and Setter Methods used to access Private Data
    public int getNumSides(){
        return numSides;
    }
    public double getSideLength(){
        return sideLength;
    }
    public double getXCoord(){
        return xCoord;
    }
    public double getYCoord(){
        return yCoord;
    }
    public double getApothem(){
        return apothem;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
     return .5 * getApothem() * getPerimeter();
    }
    public void setNumSides(int value){
        this.numSides = value;
    }
    public void setSideLength(double value){
        this.sideLength = value;
    }
    public void setXCoord(double value){
        this.xCoord = value;
    }
    public void setYCoord(double value){
        this.yCoord = value;
    }
    public void setApothem(double value){
        this.apothem = value;
    }
    public String toString(){
        return "results: "+ "(" + "numsides=" + numSides +", " + "sidelength=" + sideLength + ", " + "xCoord="+ xCoord + ", " + "yCoord="+ yCoord + ", " + "apothem="+ apothem +")";
    }
            
}