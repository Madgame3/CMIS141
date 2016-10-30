/*
* File: Array.java
* Author: Mike
* Date: 9/24/16
* Purpose: show some lotto numbers
*/


import java.util.Arrays;


public class Array {  

//declare array


static final int Array = 6;


// Main method
    public static void main(String args[]){


//create the array that pulls 5 random numbers from 1 to 69

System.out.println("!!!show some lotto numbers!!!");
	int[] intValues = new int [Array];
		for (int i=0; i<intValues.length; i++) {
	 	intValues[i] = (int) (Math.random() * 69)+1; 
	}
System.out.println("Here are your lotto numbers");

// Print the random number array

for (int i=0; i<intValues.length -1; i++) {
	System.out.println(intValues[i]) ;
    }
System.out.println("Powerball number is: " + intValues[5]);
	}

}	