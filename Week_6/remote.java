//Author: Stephen Harrington
//Date: 2 October 2016
//Purpose: Test your own class
import java.util.*;

public class remote{
    public static void main(String[] args){
        Fan one = new Fan(5, 10, true, false);
        Fan two = new Fan();
    System.out.println("------------------------------------");
    System.out.println("Fan 1: "+ one.toString());
    System.out.println("------------------------------------");
    System.out.println("Fan 2: "+ two.toString());
    System.out.println("------------------------------------");
    System.out.println("Test fan 2 by turning it on");
    two.setOnOff(true);
    System.out.println("------------------------------------");
    System.out.println("Fan 2: " + two.toString());
    System.out.println("------------------------------------");
    }
}
      
