//Author: Stephen Harrington
//Date: 2 October 2016
//Purpose: Testing HeadPhone Class
import java.awt.Color;
    public class TestHeadPhone {
        public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("Creating new Headphones 1 with default values");
        System.out.println("----------------------------------------------");
        // Creates a new instance of the HeadPhone Class
        HeadPhone headPhone1 = new HeadPhone();
        System.out.println(headPhone1.toString());
        headPhone1.setColor(Color.blue);
        headPhone1.setManufacturer("Jabra");
        headPhone1.setPluggedIn(true);
        headPhone1.changeVolume(3);
        System.out.println("----------------------------------------------");
        System.out.println("New Values of HeadPhones 1");
        System.out.println("----------------------------------------------");
        System.out.println(headPhone1.toString());
        System.out.println("----------------------------------------------");
        
        System.out.println("Creating new Headphones 2 with custom values");
        System.out.println("----------------------------------------------");
        // Creates a new instance of the HeadPhone Class
        HeadPhone headPhone2 = new HeadPhone(3, true, "beats", Color.white);
        System.out.println(headPhone2.toString());
        System.out.println("----------------------------------------------");
        headPhone2.setColor(Color.GREEN);
        headPhone2.setManufacturer("Sony");
        headPhone2.setPluggedIn(true);
        headPhone2.changeVolume(1);
        System.out.println("New Values of HeadPhones 2");
        System.out.println("----------------------------------------------");
        System.out.println(headPhone2.toString());
        System.out.println("----------------------------------------------");
        System.out.println("Creating new Headphones 2 with custom values");
        // Creates a new instance of the HeadPhone Class
        HeadPhone headPhone3 = new HeadPhone(2, true, "Apple", Color.white);
        System.out.println("----------------------------------------------");
        System.out.println(headPhone3.toString());
        System.out.println("----------------------------------------------");
        System.out.println("New Values of HeadPhones 3");
        headPhone3.setColor(Color.RED);
        headPhone3.setManufacturer("Razor");
        headPhone3.setPluggedIn(false);
        headPhone3.changeVolume(2);
        System.out.println("----------------------------------------------");
        System.out.println(headPhone3.toString());
        System.out.println("----------------------------------------------");
    }
}    